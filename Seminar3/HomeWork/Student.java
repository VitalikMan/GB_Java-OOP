package Seminar3.HomeWork;

//https://mvnrepository.com/


import lombok.Data;

//@Getter
//@AllArgsConstructor
//@RequiredArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student implements Comparable<Student> {

    private final Long id;
    private final String fullName;

    @Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }

}
