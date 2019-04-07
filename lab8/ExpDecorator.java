public class ExpDecorator implements IDecorator
{
    public ExpDecorator(){}

    public String display(String num){
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < num.length(); i++){
            if (i == 2)
                s.append("/");
            s.append(num.charAt(i));
        }

        return s.toString();
    }
}
