package jp.co.kiramex.company.entity;

public class Sales extends Employee {
    private String appointment;

    public Sales() {

    }

    public Sales(int employeeId, String employeeName, int vitality) {
        super.setEmployeeId(employeeId);
        super.setEmployeeName(employeeName);
        super.setDivisionName("営業部");
        super.setVitality(vitality);
        this.appointment = "未定";
    }

    public void report() {
        super.setVitality(super.getVitality() - 10);
        System.out.println("今日は10件アポイント取りました");
    }
    
    @Override
    public void introduce() {
        super.setVitality(super.getVitality() - 10);
        System.out.println("私の名前は"+ super.getEmployeeName()+"です。");
        System.out.println("所属部署は"+ super.getDivisionName()+"です。");
        System.out.println("今日のアポイント先は" + appointment + "です。");
    }
  @Override
  public void greeting() {
      super.setVitality(getVitality() -10);
      System.out.println(super.getDivisionName()+"の皆さん"+"おはようございます。");
  }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    
        
    
        
    }
}