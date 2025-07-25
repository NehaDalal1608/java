
class OddNumberException extends Exception {
    public OddNumberException(String message) {
    super(message);
        }
    }
    
    public class Exc {
    public static void main(String[] args) {
    try {
    int num = 7; 
    if (num % 2 != 0) {
    throw new OddNumberException(num + " is an odd number.");
                }
    System.out.println(num + " is an even number.");
            } catch (OddNumberException e) {
    System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
