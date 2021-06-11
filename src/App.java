public class App {
    public static void main(String[] args) throws Exception {

        // Exercicio 01
        System.out.print("Exercicio 1:");
        for (int i = 0; i < 23; i++) {
            System.out.print(" " + Recursao.fibonacci(i));
        }
        System.out.println("\n");

        // Exercicio 2

        System.out.print("Exercício 2: ");

        System.out.println("Vetor InsertionSort");

        int[] PrimeiroVetorInsertionSort = { 3, 5, 2, 1, 6, 7, 8, 9, 4, 10 };

        System.out.print("Vetor desorganizado: ");
        for (int i : PrimeiroVetorInsertionSort) {
            System.out.print(i + " ");
        }

        Ordenacao.insertionSort(PrimeiroVetorInsertionSort, 0, 5); // Organiza o vertor do 0 ao 5

        System.out.print("\nVetor organizado: ");
        for (int i : PrimeiroVetorInsertionSort) {
            System.out.print(i + " ");
        }

        System.out.println("\nVetor SelectionSort");

        int[] PrimeirovetorSelectionSort = { 3, 5, 2, 1, 6, 7, 8, 9, 4, 10 };

        System.out.print("Vetor desorganizado: ");
        for (int i : PrimeirovetorSelectionSort) {
            System.out.print(i + " ");
        }

        Ordenacao.selectionSort(PrimeirovetorSelectionSort, 0, 5); // Organiza o vertor do 0 ao 5

        System.out.print("\nVetor organizado: ");
        for (int i : PrimeirovetorSelectionSort) {
            System.out.print(i + " ");
        }

        System.out.println("\nVetor BubbleSort");

        int[] PrimeirovetorinBubbleSort = { 3, 5, 2, 1, 6, 7, 8, 9, 4, 10 };

        System.out.print("Vetor desorganizado: ");
        for (int i : PrimeirovetorinBubbleSort) {
            System.out.print(i + " ");
        }

        Ordenacao.selectionSort(PrimeirovetorinBubbleSort, 0, 5); // Organiza o vertor do 0 ao 5

        System.out.print("\nVetor organizado: ");
        for (int i : PrimeirovetorinBubbleSort) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nExercício 3: ");

        int[] vetor = { 3, 5, 7, 1, 6, 2, 8, 9, 4, 10 };

        Ordenacao.quickSortComRecursivo(vetor, 0, vetor.length - 1);

        System.out.print("\nVetor organizado: ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nExercício 4: "); // Exercicio 4

    }
}
