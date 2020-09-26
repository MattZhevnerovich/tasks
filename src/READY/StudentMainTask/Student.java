package READY.StudentMainTask;

class Student {
    public String id;
    public String Surname;
    public String Name;
    public String Fname;
    public int BirthDay;
    public int BirthMonth;
    public int BirthYear;
    public String Adress;
    public String PhoneNumber;
    public String Faculty;
    public int Year;
    public int GroupNumber;

    public Student(String newid, String newSurname, String newName, String newFname, int newBirthDay, int newBirthMonth,
                   int newBirthYear, String newAdress, String newPhoneNumber, String newFaculty, int newYear,
                   int newGroupNumber) {
        this.setSurname(newSurname);
        this.setId(newid);
        this.setAdress(newAdress);
        this.setBirthDay(newBirthDay);
        this.setBirthMonth(newBirthMonth);
        this.setBirthYear(newBirthYear);
        this.setFaculty(newFaculty);
        this.setName(newName);
        this.setGroupNumber(newGroupNumber);
        this.setFname(newFname);
        this.setPhoneNumber(newPhoneNumber);
        this.setYear(newYear);
    }


    @Override
    public String toString() {
        return "READY.StudentMainTask.Student{" +
                "id='" + id + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", Fname='" + Fname + '\'' +
                ", BirthDay=" + BirthDay +
                ", BirthMonth=" + BirthMonth +
                ", BirthYear=" + BirthYear +
                ", Adress='" + Adress + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", Year=" + Year +
                ", GroupNumber=" + GroupNumber +
                '}';
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return Name; }
    public void setName(String name) { Name = name; }

    public int getBirthDay() { return BirthDay; }
    public void setBirthDay(int birthDay) { BirthDay = birthDay; }

    public int getBirthMonth() { return BirthMonth; }
    public void setBirthMonth(int birthMonth) { BirthMonth = birthMonth; }

    public int getBirthYear() { return BirthYear; }
    public void setBirthYear(int birthYear) { BirthYear = birthYear; }

    public String getPhoneNumber() { return PhoneNumber; }
    public void setPhoneNumber(String phoneNumber) { PhoneNumber = phoneNumber; }

    public String getFaculty() { return Faculty; }
    public void setFaculty(String faculty) { Faculty = faculty; }

    public String getSurname() { return Surname; }
    public void setSurname(String surname) { Surname = surname; }

    public String getFname() { return Fname; }
    public void setFname(String fname) { Fname = fname; }

    public String getAdress() { return Adress; }
    public void setAdress(String adress) { Adress = adress; }

    public int getYear() { return Year; }
    public void setYear(int year) { Year = year; }

    public int getGroupNumber() { return GroupNumber; }
    public void setGroupNumber(int groupNumber) { GroupNumber = groupNumber; }
}