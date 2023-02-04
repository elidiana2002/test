public class Main {

    class Matrix {
        private int rows;
        private int columns;
        private int[][] elements;


        public Matrix(int rows, int columns) {
            this.rows = rows;
            this.columns = columns;
            elements = new int[rows][columns];
        }


        public int getRows() {
            return rows;
        }


        public int getColumns() {
            return columns;
        }


        public void setElement(int row, int column, int value) {
            elements[row][column] = value;
        }


        public Matrix add(Matrix other) {
            if (rows != other.rows || columns != other.columns) {
                System.out.println("Error: Matrix dimensions do not match");
                return null;
            }

            Matrix result = new Matrix(rows, columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result.elements[i][j] = elements[i][j] + other.elements[i][j];
                }
            }

            return result;
        }


        public Matrix multiply(Matrix other) {
            if (columns != other.rows) {
                System.out.println("Error: Matrix dimensions do not match");
                return null;
            }

            Matrix result = new Matrix(rows, other.columns);
            for (int i = 0; i < result.rows; i++) {
                for (int j = 0; j < result.columns; j++) {
                    int sum = 0;
                    for (int k = 0; k < columns; k++) {
                        sum += elements[i][k] * other.elements[k][j];
                    }
                    result.elements[i][j] = sum;
                }
            }

            return result;
        }
    }
    //2
    abstract class Student {
        abstract void sustineExamen();
    }

    class PhdStudent extends Student {
        @Override
        void sustineExamen() {
            System.out.println("Examenul se desfasoara prin prezentarea finala.");
        }
    }

    class GradStudent extends Student {
        @Override
        void sustineExamen() {
            System.out.println("Examenul se desfasoara prin examen scris.");
        }
    }
}