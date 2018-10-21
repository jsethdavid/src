public class HexDigit implements BaseDigit {
    int value;
    char charindex;


    public HexDigit(char number) throws IllegalArgumentException
    {
        charindex = number;
        valueAsInt();

    }
    @Override
    public int base() { return 16; }

    @Override
    public int valueAsInt() {
        switch(charindex)
    {
        case 'A':
            charindex = 10;

        case 'B':
            charindex = 11;

        case 'C':
            charindex = 12;

        case 'D':
            charindex = 13;

        case 'E':
            charindex = 14;

        case 'F':
            charindex = 15;
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
