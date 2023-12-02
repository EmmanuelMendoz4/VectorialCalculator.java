public class VectorOperations {

    public static void main(String[] args) {

        // Vectores en R^2
        Vector2D vector2D_A = new Vector2D(new double[]{3, 3});
        Vector2D vector2D_B = new Vector2D(new double[]{1, 4});
        Vector2D vector2D_C = new Vector2D(new double[]{4, 7});

        // Vectores en R^3
        Vector3D vector3D_A = new Vector3D(new double[]{3, 3, 2});
        Vector3D vector3D_B = new Vector3D(new double[]{1, 4, 4});
        Vector3D vector3D_C = new Vector3D(new double[]{4, 7, 5});
        Vector3D vector3D_D = new Vector3D(new double[]{4, 3, -5});

        // Operaciones en R^2
        double[] suma2D = vector2D_A.add(vector2D_B);
        double[] resta2D = vector2D_A.rest(vector2D_B);
        double scalar = 7;
        double[] scalarSumResult = vector2D_A.scalarMultiplicationOfSum(vector2D_A, vector2D_C, scalar);
        double anotherScalar = 7;
        double[] customOperationResult = vector2D_A.customOperation(vector2D_A, vector2D_B, vector2D_C, anotherScalar);
        double[] customOperation2Result = vector2D_A.customOperation2(vector2D_A, vector2D_B, vector2D_C);
        double productoEscalar2D = vector2D_A.dotProduct(vector2D_B);

        // Operaciones en R^3
        double[] suma3D = vector3D_A.add(vector3D_B);
        double[] resta3D = vector3D_A.rest(vector3D_B);
        double productoEscalar3D = vector3D_A.dotProduct(vector3D_B);
        double[] productoCruz3D = vector3D_A.crossProduct(vector3D_B);
        double[] customOperation3Result = vector3D_A.customOperation3(vector3D_A, vector3D_B, vector3D_C, vector3D_D);

        // Mostrar resultados

        System.out.println("\nA = (3, 3)" );
        System.out.println("B = (1, 4)" );
        System.out.println("C = (4, 7)" );
        System.out.println();
        System.out.println("U = (3, 3, 2)" );
        System.out.println("V = (1, 4, 4)" );
        System.out.println("W = (4, 7, 5)" );
        System.out.println("Z = (4, 3, -5)" );


        // Espacios en R^2
        System.out.println();
        System.out.println("Conjuntos (vectores) en R^2:");
        System.out.println("1- A + B.\nR= (" + suma2D[0] + ", " + suma2D[1] + ")\n");
        System.out.println("2- A - B.\nR= (" + resta2D[0] + ", " + resta2D[1] + ")\n");
        System.out.println("3- 7 * (A + C)\nR= (" + scalarSumResult[0] + ", " +scalarSumResult[1] + ")\n");
        System.out.println("4- (7 * (A + B)) - C\nR= (" + customOperationResult[0] + ", " + customOperationResult[1] + ")\n");
        System.out.println("5- R = ||4(A) + 5 (B) - (C)||\nR= (" + customOperation2Result[0] + ", " + customOperation2Result[1] + ")\n");
        /*System.out.println();
        System.out.println("Producto Escalar: " + productoEscalar2D);*/
        System.out.println();

        // Espacios en R^3
        System.out.println("Espacio en R^3");
        System.out.println("1- (U + V)\nR= (" + suma3D[0] + ", " + suma3D[1] + ", " + suma3D[2] + ")\n");
        System.out.println("2- (u - v)\nR (" + resta3D[0] + ", " + resta3D[1] + ", " + resta3D[2] + ")\n");
        System.out.println("3- Producto Escalar: " + productoEscalar3D);
        System.out.println("4- Producto Cruz: (" + productoCruz3D[0] + ", " + productoCruz3D[1] + ", " + productoCruz3D[2] + ")");
        System.out.println();
        System.out.println("5- R = ||(4(U) * 2(V)) Z) * W||: (" + customOperation3Result[0] + ", " + customOperation3Result[1] + ", " + customOperation3Result[2] + ")");
    }
}