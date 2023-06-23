package Seminar6.HomeWork.Task3;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Greeter {

    private String formality;

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
