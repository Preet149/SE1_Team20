package Exercise8.PartielleOrdnung;

interface Iterator<String> {

    public String next() throws IllegalArgumentException;
    public boolean hasnext();
}
