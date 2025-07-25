 class NoVowelException extends Exception {
    public NoVowelException(String message) {
    super(message);
        }
    }
    
    public class Vow {
    public static void main(String[] args) {
    try {
      String Word = "Diksha";
    if (!Word.matches(".*[aeiou].*")) {
    throw new NoVowelException(Word+ " does not contain vowels.");
                }
    System.out.println(Word+ " is a valid string.");
            } catch (NoVowelException e) {
    System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
