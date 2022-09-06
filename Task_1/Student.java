package Task_1;

public class Student{
    //id, Прізвище, Ім'я, По-батькові, Дата народження, Адреса, Телефон, Факультет, Курс, Група.
    private int id;
    private String name;
    private String fatherName;
    private String dataBirthday;
    private String address;
    private String phone;
    private String faculty;
    private byte kurs;
    private String group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getDataBirthday() {
        return dataBirthday;
    }

    public void setDataBirthday(String dataBirthday) {
        this.dataBirthday = dataBirthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getKurs() {
        return String.valueOf(kurs);
    }

    public void setKurs(byte kurs) {
        this.kurs = kurs;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(int id, String name, String faculty, byte kurs, String group) {
        this.id = id;
        this.name = name;
//        this.fatherName = getFatherName();
        this.dataBirthday = getDataBirthday();
//        this.address = getAddress();
//        this.phone = getPhone();
        this.faculty = faculty;
        this.kurs = kurs;
        this.group = group;
    }

    public Student(int id, String name, String fatherName, String dataBirthday, String address, String phone, String faculty, byte kurs, String group) {
        this.id = id;
        this.name = name;
        this.fatherName = fatherName;
        this.dataBirthday = dataBirthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.kurs = kurs;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                //", fatherName='" + fatherName + '\'' +
                ", dataBirthday='" + dataBirthday + '\'' +
                ", address='" + address + '\'' +
                //", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", kurs=" + kurs +
                ", group='" + group + '\'' +
                '}';
    }
}
