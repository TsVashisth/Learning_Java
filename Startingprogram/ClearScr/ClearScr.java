/*This cls is used to clear consol in os as other traditional methods are pain 
 * Caution not to instantiated
 * not to use directly 
*/
public class ClearScr{
    public static void main(String[] args) {
    }
    public static void clear() 
    {
        try{
            final String osName = System.getProperty("os.name");
            if (osName.contains("Windows")){
            new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
            }
            else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e){
            e.printStackTrace();
    
        }    
    }
}
