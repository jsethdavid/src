public interface BaseDigit
{
    /**
     * Return the base of this digit
     * @return the base
     */
    int base();

    /**
     Convert the digit to an int and return it
     **/
    int valueAsInt();

    /**
     Return the character representation of the digit
     **/
    char valueAsChar();

    /**
     Compare this digit to other digits
     **/
    <T extends BaseDigit> int compareTo(T otherNumber);
}

