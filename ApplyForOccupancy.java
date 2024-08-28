public class ApplyForOccupancy {
  private String name;
  private String studentId;
  private String startDate;
  private String endDate;
  private String number;

  public ApplyForOccupancy(String name, String studentId, String startDate, String endDate, String number) {
    this.name = name;
    this.studentId = studentId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.number = number;
  }



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }



  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }



  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public String getNumber(){
    return number;
  }
  public void setNumber(){
    this.number = number;
  }
}
