public class BinarioParaDecimal {
    public static void main(String[] args) {
        int[] arrayBinario = { 1, 0, 0, 1, 1, 0, 0, 1 };
        int[] arrayDecimal = converterBinarioParaDecimal(arrayBinario);
        int valorDecimal = arrayParaValor(arrayDecimal);

        System.out.print("Número binário: ");
        for (int bit : arrayBinario){
            System.out.print(bit);
        }
        System.out.println();
        System.out.println("-----------------------");

        System.out.print("Número decimal ");
        for(int digitoDecimal : arrayDecimal){
            System.out.print(digitoDecimal);
        }
        System.out.println();
        System.out.println("-----------------------");
        System.out.println(valorDecimal);

    }

    public static int[] converterBinarioParaDecimal(int[] arrayBinario){
        int [] arrayDecimal = new int[8];

        for(int i = 0; i < 8; i++){
            int bit = arrayBinario[i];
            int power = (arrayBinario.length - 1) - i;
            arrayDecimal[i] = bit * (int)Math.pow(2, power);
        }
        return arrayDecimal;
    }
    public static int arrayParaValor(int[] arrayDecimal){
        int soma = 0;
        for(int i = 0; i < arrayDecimal.length; i++){
        soma += arrayDecimal[i];
        }
        return soma;
    }
   
}
