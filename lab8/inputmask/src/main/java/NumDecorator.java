public class NumDecorator implements IDecorator
{
    public NumDecorator(){}

    public String display(String num){
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < num.length(); i++){
            if (i > 1 && i % 4 == 0)
                s.append(" ");
            s.append(num.charAt(i));
        }

        return s.toString();
    }
}
