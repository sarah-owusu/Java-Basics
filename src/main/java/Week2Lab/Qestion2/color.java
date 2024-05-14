package Week2Lab.Qestion2;

public class color {
    public static void main(String args[]){
        Color.printColorAndCode();
    }
    public enum Color{
        red(""),
        green(""),
        blue(""),
        yellow(""),
        black("");

        private final String colorCode;
        Color(String colorCode){
            this.colorCode = colorCode;
        }

        public String getColorCode(){
            return colorCode;
        }

        public static void printColorAndCode(){
            for (Color color : Color.values()){
                System.out.println(color.name() + "color code:" + color.getColorCode());
            }
        }
    }
}
