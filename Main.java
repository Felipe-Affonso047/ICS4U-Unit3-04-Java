/*
* This program test the stack class
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-08
*/

/**
 * Main.
 */
final class Main {
    /**
    * Constant.
    */
    public static final int TWELVE = 12;

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final MrCoxallStack stack = new MrCoxallStack();

        stack.push("bob");
        stack.push(TWELVE);

        System.out.println("Inicial Stack:");
        stack.showStack();

        System.out.println("Peak stack:");
        final Object peakVal = stack.peak();
        System.out.println(peakVal);

        System.out.println("Show Stack:");
        stack.showStack();

        System.out.println("Clear Stack:");
        stack.clear();
        stack.showStack();

        System.out.println("\nDone.");
    }
}
