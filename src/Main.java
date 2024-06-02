import java.util.Scanner;

public class Main {

    Person person = new Person();
    public void age(int age){
        person.setAge(age);
        System.out.println("Năm sinh của bạn là: "+ person.predictAge());
    }
    Circle circle = new Circle();
    public void circle(int setCircle){
        circle.setRadius(setCircle);
        System.out.println("Diện tích hình tròn là: "+circle.area());
        System.out.println("Chu vi hình tròn là: "+circle.perimeter());
    }
    SpeedCar speedCarClass = new SpeedCar();
    public void speedCar(int speedCar){
        speedCarClass.setSpeed(speedCar);
        System.out.println("Tốc độ của xe là: "+ speedCarClass.getSpeed());
    }
    public void convertTime(int type){
        Scanner keyDownTime = new Scanner(System.in);
        ConvertTime convertTime = new ConvertTime();
        int value;

        switch(type){
            case 1:
                System.out.print("Chọn số giờ để chuyển sang phút: ");
                value = keyDownTime.nextInt();
                convertTime.setInitValue(value);
                System.out.println("Tổng số phút là: "+convertTime.convertHourToMinutes());
                break;
            case 2:
                System.out.print("Chọn số ngày để chuyển sang phút: ");
                value = keyDownTime.nextInt();
                convertTime.setInitValue(value);
                System.out.println("Tổng số phút là: "+convertTime.convertDaysToMinutes());
                break;
            default:
                System.out.println("Không hợp lệ");
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner keydown = new Scanner(System.in);
        int num;
        System.out.println("1: Chương trình tính số tuổi.");
        System.out.println("2: Chương trình tính diện tích chu vi và hình tròn.");
        System.out.println("3: Phương thức tăng tốc độ xe theo ý muốn.");
        System.out.println("4: Chương trình ứng dụng chuyển đổi thời gian.");
        System.out.print("Mời bạn chọn số bên trên để thực hiện: ");
        if(keydown.hasNextInt()){
            num = keydown.nextInt();
            switch (num){
                case 1:
                    int age;
                    System.out.print("Vui lòng nhập tuổi của bạn: ");
                    if(keydown.hasNextInt()){
                        age = keydown.nextInt();
                        main.age(age);
                    }else{
                        System.out.print("Bắt buộc phải là số!");
                    }
                    break;
                case 2:
                    int circle;
                    System.out.print("Vui lòng nhập bán kính: ");
                    if(keydown.hasNextInt()){
                        circle = keydown.nextInt();
                        main.circle(circle);
                    }else{
                        System.out.print("Bắt buộc phải là số!");
                    }
                    break;
                case 3:
                    int speedCar;
                    System.out.print("Vui lòng nhập tốc độ: ");
                    if(keydown.hasNextInt()){
                        speedCar = keydown.nextInt();
                        main.speedCar(speedCar);
                    }else{
                        System.out.print("Bắt buộc phải là số!");
                    }
                    break;
                case 4:
                    int type;
                    System.out.println("1: Phương thức xử lý chuyển giờ thành phút");
                    System.out.println("2: Phương thức xử lý chuyển ngày thành phút");
                    System.out.print("Vui lòng nhập phương thức cần chọn: ");
                    if(keydown.hasNextInt()){
                        type = keydown.nextInt();
                        main.convertTime(type);
                    }else{
                        System.out.print("Bắt buộc phải là số!");
                    }
                    break;
                default:
                    System.out.print("Không khớp!");
            }
        }else{
            System.out.print("Bạn phải nhập 1 số nguyên!");

        }
    }
}