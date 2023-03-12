public class Pyramid {
    // /
    //  * TODO: Return a string that is a pyramid of size n, made of of asterisks and no spaces.
    //  *
    //  *     for example:
    //  *
    //  *     size 3:
    //  *     *
    //  *     
    //  *     *
    //  *
    //  *     size 5:
    //  *     *
    //  *     
    //  *     *
    //  *     **
    //  *     *
    //  *
    //  * The newline character can be written as \n .
    //  * The tests will not be affected by a newline character at the beginning or end of the entire pyramid.
    //  *
    //  * Here's a hint: you could use a for loop inside of a for loop for this problem. The outer for loop
    //  * can determine the current 'row', and the inner for loop can print an asterisk an amount of times based on the
    //  * current 'row'.
    //  *
    //  * @param n the size of the pyramid.
    //  * @return a string representation of the pyramid.
    //  /
    public String returnPyramid(int n){
        String pyramid = "";
        for (int row = 0; row <= n; row++){
            String ast_in_row = "";
            for (int ast_count = 0; ast_count < row; ast_count++){
                ast_in_row = ast_in_row + "*";
            }
            pyramid = pyramid + ast_in_row + '\n';
        }
        return pyramid;
    }
    // public String returnPyramid(int n){
    //     String pyramid = "";
    //     for( int i=1; i<=n; i++ ){
    //         pyramid =  pyramid + getString(i) + "\n";

    //     }
    //     return pyramid;
    // }

    // private String getString(int times){
    //     String str = "";
    //     while( times > 0 ){
    //         str = str + "";
    //         times--;
    //     }
    //     return str;
    // }
}


