public class DigitDigit implements BaseDigit {
    int value;
    char charindex;

    public DigitDigit(char number) throws IllegalArgumentException
    {
        charindex = number;
        valueAsInt();
    }
    @Override
    public int base() {
        return 10;
    }

    @Override
    public int valueAsInt() {
        switch(charindex)
        {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
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
        if(value > otherNumber.valueAsInt())
            return 1;



        else if(value < otherNumber.valueAsInt())
            return -1;



        else return 0;
    }
}
