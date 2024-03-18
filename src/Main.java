import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = { 1,1,1,1,1,1,2,2,3,3 };
        convertArrayToString( a );
    }
    public static void addWordKey(List<Map.Entry<Integer, Integer>> list, Integer key, Integer value){
        list.add(new HashMap.SimpleEntry<>( key, value ));
    }
    public static void convertArrayToString( int[] array ){
        List<Map.Entry<Integer, Integer>> words = new ArrayList<>();

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
        int tmpCount = 0;
        int count = 0;

        // get counts of nums
        for( int i = 0; i < array.length; i++ ){
            if( tmp != array[i] ) {
                tmp = array[i];
                addWordKey(words, tmp, count);
                count = 0;
            }
            if( count == 4 ){
                addWordKey(words, tmp, 4);
                count = 0;
            }
            if( i == array.length - 1 )
                addWordKey(words, tmp, count + 1);
            count++;
//            System.out.println("i: " + i + " count: " + count);
        }

        StringBuilder convertedArray = new StringBuilder();
        for( Map.Entry<Integer, Integer> i : words){
            System.out.println("Key: " + i.getKey() + " Value: " + i.getValue());
            switch( i.getKey() ) {
                case 1 : {
                    if( i.getValue() != 0 )
                        convertedArray.append( key1[ i.getValue() - 1 ] );
                    else
                        convertedArray.append( key1[ i.getValue() ] );
                    break;
                }
                case 2 : {
                    if( i.getValue() != 0 )
                        convertedArray.append( key2[ i.getValue() - 1 ] );
                    else
                        convertedArray.append( key2[ i.getValue() ] );
                    break;
                }
                case 3 : {
                    if( i.getValue() != 0 )
                        convertedArray.append( key3[ i.getValue() - 1 ] );
                    else
                        convertedArray.append( key3[ i.getValue() ] );
                    break;
                }
                case 4 : {
                    if( i.getValue() != 0 )
                        convertedArray.append( key4[ i.getValue() - 1 ] );
                    else
                        convertedArray.append( key4[ i.getValue() ] );
                    break;
                }
                case 5 : {
                    if( i.getValue() != 0 )
                        convertedArray.append( key5[ i.getValue() - 1 ] );
                    else
                        convertedArray.append( key5[ i.getValue() ] );
                    break;
                }
                case 6 : {
                    if( i.getValue() != 0 )
                        convertedArray.append( key6[ i.getValue() - 1 ] );
                    else
                        convertedArray.append( key6[ i.getValue() ] );
                    break;
                }
                case 7 : {
                    if( i.getValue() != 0 )
                        convertedArray.append( key7[ i.getValue() - 1 ] );
                    else
                        convertedArray.append( key7[ i.getValue() ] );
                    break;
                }
                case 8 : {
                    if( i.getValue() != 0 )
                        convertedArray.append( key8[ i.getValue() - 1 ] );
                    else
                        convertedArray.append( key8[ i.getValue() ] );
                    break;
                }
                case 9 : {
                    if( i.getValue() != 0 )
                        convertedArray.append( key9[ i.getValue() - 1 ] );
                    else
                        convertedArray.append( key9[ i.getValue() ] );
                    break;
                }
            }
        }
        System.out.println(convertedArray);
    }
}