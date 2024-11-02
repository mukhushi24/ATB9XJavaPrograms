package Task.Task_29102024arrays;

public class Lab_51elementduplicate {
    public static void main(String[] args) {
        String[] tree = {"neem", "papaya", "mango", "papaya" };
        boolean hasDuplicates = f1duplicate(tree);
        System.out.println("has duplicates: " + hasDuplicates);


    }

    static boolean f1duplicate(String[] tree) {
        for (int i = 0; i < tree.length; i++) {
            for (int j = i + 1; j < tree.length; j++) {
                if (tree[i].equals(tree[j])) {
                    return true;
                }
            }

        }
        return false;
    }

}
