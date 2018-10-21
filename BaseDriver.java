public class BaseDriver {
    public static void main(String [] args) {

        DigitSequence<HexDigit> hexSeq = new DigitSequence<>();
        DigitSequence<DigitDigit> digitSeq = new DigitSequence<>();

        hexSeq.add(new HexDigit('F'));
        hexSeq.add(new HexDigit('E'));
        hexSeq.add(new HexDigit('D'));

        digitSeq.add(new DigitDigit('7'));
        digitSeq.add(new DigitDigit('7'));
        digitSeq.add(new DigitDigit('7'));
        digitSeq.add(new DigitDigit('7'));
        digitSeq.add(new DigitDigit('7'));
        digitSeq.add(new DigitDigit('7'));

        DigitSequence<BaseDigit> baseSeq = new DigitSequence<>();

        baseSeq.add(new DigitDigit('1'));
        baseSeq.add(new BinaryDigit('0'));

        if (baseSeq.compareTo(digitSeq) < 1) {
            System.out.println("baseSeq is smaller");
        }else
        {
            System.out.println("baseSeq is larger");
        }


//count the values less than 1
        long value = countLessThan(baseSeq, 1);

//count the values less than 5
        long value2 = countLessThan(digitSeq, 5);


    }
    public static long countLessThan(DigitSequence sequence, long longCountless)
    {
        long count = sequence.toStream()
            .filter(v-> ((BaseDigit)v).valueAsInt() < longCountless)
            .count();

        return count;
    }

}
