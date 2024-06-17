public class CharArrayReplacement {
    private final char[] source;
    private final char[] find;
    private final char[] replace;

    public CharArrayReplacement(char[] source, char[] find, char[] replace) {
        this.source = source;
        this.find = find;
        this.replace = replace;
    }

    public char[] replaceSequence() {
        int resultMaxLength = source.length + (replace.length - find.length) * countOccurrences(source, find);
        char[] result = new char[resultMaxLength];

        int resultIndex = 0;
        int[] findIndices = new int[find.length];

        for (int i = 0; i < source.length; i++) {
            if (isEqual(source, i, find, findIndices)) {
                for (char c : replace) {
                    result[resultIndex] = c;
                    resultIndex++;
                }
                i += find.length - 1;
            } else {
                result[resultIndex] = source[i];
                resultIndex++;
            }
        }

        char[] finalResult = new char[resultIndex];
        System.arraycopy(result, 0, finalResult, 0, resultIndex);

        return finalResult;
    }

    private static int countOccurrences(char[] source, char[] pattern) {
        int count = 0;
        for (int i = 0; i <= source.length - pattern.length; i++) {
            if (isEqual(source, i, pattern, null)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isEqual(char[] source, int sourceIndex, char[] pattern, int[] patternIndices) {
        for (int i = 0; i < pattern.length; i++) {
            if (sourceIndex + i >= source.length || source[sourceIndex + i] != pattern[i]) {
                return false;
            }

            if (patternIndices != null) {
                patternIndices[i] = sourceIndex + i;
            }
        }
        return true;
    }
}
