public class BinaryDigit implements BaseDigit
{
    int value ;
    char charindex;

    public BinaryDigit(char number) throws IllegalArgumentException
    {
         charindex = number;
         valueAsInt();

    }
    @Override
    public int base() {
        return 2;
    }

    @Override
    public int valueAsInt() {
        switch (charindex)
        {
            case '0':
            case '1':
                value = Integer.parseInt(String.valueOf(charindex));
                break;
                default:
                    throw new IllegalStateException();
        }
        return value;
    }

    @Override
    public char valueAsChar() {
        return charindex;
    }

    @Override
    public <T extends BaseDigit> int compareTo(T otherNumber) {
        if(value > otherNumber.valueAsInt() )
            return 1;




        else if(value < otherNumber.valueAsInt())
            return -1;



        else return 0;
    }
}
