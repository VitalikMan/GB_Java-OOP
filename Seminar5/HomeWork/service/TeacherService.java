package Seminar5.HomeWork.service;

import Seminar5.HomeWork.model.Teacher;
import Seminar5.HomeWork.repository.TeacherRepository;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
@Data
public class TeacherService implements UserService<Teacher> {

    public final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupId) {
        Long id = teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age, phoneNumber, groupId);
        teacherRepository.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        System.out.println("\t\tСортировка всего списка учителей:");
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        System.out.println("\t\t\tСортировка по фамилии");
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparatorBySecondName<>());
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        System.out.println("\t\t\tСортировка по возрасту");
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparatorByAge<>());
        return teachers;
    }

    @Override
    public void removeUser(String fullName) {
        teacherRepository.remove(fullName);
    }

    public boolean editTeacher(Long id){
        teacherRepository.editTeacher(id);
        return true;
    }
}
