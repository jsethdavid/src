import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Collections;

public class DigitSequence <T extends BaseDigit> extends ArrayList
{

    public void add(BaseDigit object)
    {
        super.add(object);

    }

@Override
    public BaseDigit remove(int index)
    {
        BaseDigit clear = this.remove(index);
        return clear;

    }


    public void sort() {
        Collections.sort(this);
    }

    public int compareTo(DigitSequence summation)
    {
        int firstsum = summation.toStream()
                .mapToInt(w->((BaseDigit)w).valueAsInt())
                .sum();

        int secondsum = summation.toStream()
                .mapToInt(w->((BaseDigit)w).valueAsInt())
                .sum();

        return firstsum - secondsum;
    }


    public Stream toStream()
    {
        Stream<BaseDigit> stream = this.stream(); {
        }
        return stream;


    }



}
