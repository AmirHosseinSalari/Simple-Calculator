import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        String numberOne = "";
        String numberTwo = "";
        String operation = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number one : ");
        numberOne = scanner.nextLine();
        System.out.println("Please enter number two : ");
        numberTwo = scanner.nextLine();

        System.out.println("Please enter one of the flowing operation ");
        System.out.println("multiply divide add subtract");
        operation = scanner.nextLine();

        for (Method method : Calculator.class.getMethods()){
            if (method.getName().equals(operation)){
                Object object =  method.invoke(Calculator.class.newInstance(),new BigDecimal(numberOne),new BigDecimal(numberTwo));
                System.out.println(((BigDecimal)object).toString());
            }
        }
    }
}
