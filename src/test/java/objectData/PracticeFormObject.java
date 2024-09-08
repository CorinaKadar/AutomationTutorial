package objectData;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class PracticeFormObject extends GeneralObject {
    private String firstNameValue;
    private String lastNameValue;
    private String emailValue;
    private String genderValue;
    private String mobileNumberValue;
    private String dateOfBirthDaysValue;
    private String subjectInputValue;
    private List<String> hobbiesValue;
    private String picturePathValue;
    private String addressValue;
    private String stateInputValue;
    private String cityInputValue;

    public PracticeFormObject(String filePath) {
        fromJsonToObject(filePath);
    }
}