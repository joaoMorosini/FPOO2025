package builder;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class Person {

    static public enum MaritalStatus {
        MARIAGED, SINGLE, WIDOW, DIVORCED
    }

    private final String firstName;
    private final String middleName;
    private final String familyName;
    private final Character gender;
    private final LocalDate dateOfBirth;
    private final String motherFullName;
    private final String RG;
    private final String CPF;
    private final MaritalStatus maritalStatus;
    private final String ethnicity;
    private final String skinColor;
    private final String eyeColor;
    private final String hairColor;
    private final Double height;
    private final Double weight;
    private final String phone;
    private final String mobilePhone;
    private final String email;

    public Person(
            String firstName,
            String middleName,
            String familyName,
            Character gender,
            LocalDate dateOfBirth,
            String motherFullName,
            String RG,
            String CPF,
            MaritalStatus maritalStatus,
            String ethnicity,
            String skinColor,
            String eyeColor,
            String hairColor,
            Double height,
            Double weight,
            String phone,
            String mobilePhone,
            String email) {

        super();

        this.firstName = firstName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.motherFullName = motherFullName;
        this.RG = RG;
        this.CPF = CPF;
        this.maritalStatus = maritalStatus;
        this.ethnicity = ethnicity;
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Character getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMotherFullName() {
        return motherFullName;
    }

    public String getRG() {
        return RG;
    }

    public String getCPF() {
        return CPF;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public Integer age() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(dateOfBirth, now);

        return period.getYears();
    }

    public String fullName() {

        String fullName = firstName;
        fullName = middleName.isBlank() ? fullName : fullName + " " + middleName;
        fullName = familyName.isBlank() ? fullName : fullName + " " + familyName;

        return fullName;
    }

    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("{")
                .append("full name = ").append(fullName()).append(", ")
                .append("gender = ").append(getGender()).append(", ")
                .append("dateOfBirth = ").append(getDateOfBirth()).append(", ")
                .append("motherFullName = ").append(getMotherFullName()).append(", ")
                .append("RG = ").append(getRG()).append(", ")
                .append("CPF = ").append(getCPF()).append(", ")
                .append("maritalStatus = ").append(getMaritalStatus()).append(", ")
                .append("ethnicity = ").append(getEthnicity()).append(", ")
                .append("skinColor = ").append(getSkinColor()).append(", ")
                .append("eyeColor = ").append(getEyeColor()).append(", ")
                .append("hairColor = ").append(getHairColor()).append(", ")
                .append("height = ").append(getHeight()).append(", ")
                .append("weight = ").append(getWeight()).append(", ")
                .append("phone = ").append(getPhone()).append(", ")
                .append("mobilePhone = ").append(getMobilePhone()).append(", ")
                .append("email = ").append(getEmail())
                .append("}");
        return builder.toString();
    }

    public static void main(String[] args) {

        Person person = new Person(
                "Vilson",
                "Luiz",
                "Mole",
                'M',
                LocalDate.parse("04/01/1971", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "Maria Mole",
                "123456789",
                "98765432100",
                MaritalStatus.MARIAGED,
                "White",
                "Fair",
                "Brown",
                "Black",
                1.75,
                75.0,
                "(11) 2345-6789",
                "(11) 91234-5678",
                "vilson@example.com");
                
                System.out.println(person);
    }
}
