import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] a = { 1, };
        convertArrayToString( a );
    }

    public static void convertArrayToString( int[] array ){
        char[] key1 = {'а', 'б', 'в', 'г'};
        char[] key2 = {'д', 'е', 'ё', 'ж'};
        char[] key3 = {'з', 'и', 'й', 'к'};
        char[] key4 = {'л', 'м', 'н', 'о'};
        char[] key5 = {'п', 'р', 'с', 'т'};
        char[] key6 = {'у', 'ф', 'х', 'ц'};
        char[] key7 = {'ч', 'ш', 'щ'};
        char[] key8 = {'ъ', 'ы', 'ь'};
        char[] key9 = {'э', 'ю', 'я'};

        int tmp = array[0];
        int count = 0;
        HashMap<Integer, Integer> words = new HashMap<>();

        // get counts of nums
        for( int i = 0; i < array.length; i++ ){
            if( tmp != array[i] ) {
                tmp = array[i];
                count = 0;
            }
            count++;
            words.put( tmp, count );
        }

        StringBuilder convertedArray = new StringBuilder();
        for( Integer i : words.keySet()){
            switch( i ) {
                case 1 : {
                    convertedArray.append( key1[ words.get( i ) - 1 ] );
                    break;
                }
                case 2 : {
                    convertedArray.append( key2[ words.get( i ) - 1 ] );
                    break;
                }
                case 3 : {
                    convertedArray.append( key3[ words.get( i ) - 1 ] );
                    break;
                }
                case 4 : {
                    convertedArray.append( key4[ words.get( i ) - 1 ] );
                    break;
                }
                case 5 : {
                    convertedArray.append( key5[ words.get( i ) - 1 ] );
                    break;
                }
                case 6 : {
                    convertedArray.append( key6[ words.get( i ) - 1 ] );
                    break;
                }
                case 7 : {
                    convertedArray.append( key7[ words.get( i ) - 1 ] );
                    break;
                }
                case 8 : {
                    convertedArray.append( key8[ words.get( i ) - 1 ] );
                    break;
                }
                case 9 : {
                    convertedArray.append( key9[ words.get( i ) - 1 ] );
                    break;
                }
            }
        }
        System.out.println(convertedArray);
    }
}