/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class Main {

    String[] faceFront = {"F", "F", "F", "F", "F", "F", "F", "F", "F"};
    String[] faceLeft = {"L", "L", "L", "L", "L", "L", "L", "L", "L"};
    String[] faceTop = {"T", "T", "T", "T", "T", "T", "T", "T", "T"};
    String[] faceRight = {"R", "R", "R", "R", "R", "R", "R", "R", "R"};
    String[] faceDown = {"D", "D", "D", "D", "D", "D", "D", "D", "D"};
    String[] faceBack = {"B", "B", "B", "B", "B", "B", "B", "B", "B"};

    // 0 = front; 1 = left; 2 = back; 3 = right; 4 = top; 5 = down;
    String[][] cubo = {faceFront, faceLeft, faceBack, faceRight, faceTop, faceDown};

    public void rotacionarHorario(int indice) {

        String[] CopiaFaceLeft = faceLeft.clone();
        String[] CopiaFaceRight = faceRight.clone();
        String[] CopiaFaceTop = faceTop.clone();
        String[] CopiaFaceDown = faceDown.clone();
        String[] CopiaFaceFront = faceFront.clone();
        String[] CopiaFaceBack = faceBack.clone();

        String[][] CopiaCubo = {CopiaFaceFront, CopiaFaceLeft, CopiaFaceBack, CopiaFaceRight, CopiaFaceTop, CopiaFaceDown};

        String[] faceRotacao = cubo[indice];
        String[] CopiaFace = faceRotacao.clone();

        for (int i = 0; i < 9; i++) {
            String valor = CopiaFace[i];
            int indiceArray = (i + 2 * (i + 1)) % 10;
            faceRotacao[indiceArray] = valor;
        }

        switch (indice) {
            case 0:
                CopiaFaceTop[8] = faceLeft[2];
                CopiaFaceTop[7] = faceLeft[5];
                CopiaFaceTop[6] = faceLeft[8];

                CopiaFaceRight[6] = faceTop[8];
                CopiaFaceRight[3] = faceTop[7];
                CopiaFaceRight[0] = faceTop[6];

                CopiaFaceDown[0] = faceRight[6];
                CopiaFaceDown[1] = faceRight[3];
                CopiaFaceDown[2] = faceRight[0];

                CopiaFaceLeft[2] = faceDown[0];
                CopiaFaceLeft[5] = faceDown[1];
                CopiaFaceLeft[8] = faceDown[2];

                faceLeft[2] = CopiaFaceLeft[2];
                faceLeft[5] = CopiaFaceLeft[5];
                faceLeft[8] = CopiaFaceLeft[8];

                faceTop[8] = CopiaFaceTop[8];
                faceTop[7] = CopiaFaceTop[7];
                faceTop[6] = CopiaFaceTop[6];

                faceRight[6] = CopiaFaceRight[6];
                faceRight[3] = CopiaFaceRight[3];
                faceRight[0] = CopiaFaceRight[0];

                faceDown[0] = CopiaFaceDown[0];
                faceDown[1] = CopiaFaceDown[1];
                faceDown[2] = CopiaFaceDown[2];

                break;

            case 1:
                CopiaFaceTop[6] = faceBack[6];
                CopiaFaceTop[3] = faceBack[3];
                CopiaFaceTop[0] = faceBack[0];

                CopiaFaceFront[6] = faceTop[6];
                CopiaFaceFront[3] = faceTop[3];
                CopiaFaceFront[0] = faceTop[0];

                CopiaFaceDown[6] = faceFront[6];
                CopiaFaceDown[3] = faceFront[3];
                CopiaFaceDown[0] = faceFront[0];

                CopiaFaceBack[6] = faceDown[6];
                CopiaFaceBack[3] = faceDown[3];
                CopiaFaceBack[0] = faceDown[0];

                faceBack[6] = CopiaFaceBack[6];
                faceBack[3] = CopiaFaceBack[3];
                faceBack[0] = CopiaFaceBack[0];

                faceTop[6] = CopiaFaceTop[6];
                faceTop[3] = CopiaFaceTop[3];
                faceTop[0] = CopiaFaceTop[0];

                faceFront[6] = CopiaFaceFront[6];
                faceFront[3] = CopiaFaceFront[3];
                faceFront[0] = CopiaFaceFront[0];

                faceDown[6] = CopiaFaceDown[6];
                faceDown[3] = CopiaFaceDown[3];
                faceDown[0] = CopiaFaceDown[0];
                break;

            case 2:
                CopiaFaceDown[8] = faceLeft[6];
                CopiaFaceDown[7] = faceLeft[3];
                CopiaFaceDown[6] = faceLeft[0];

                CopiaFaceRight[2] = faceDown[8];
                CopiaFaceRight[5] = faceDown[7];
                CopiaFaceRight[8] = faceDown[6];

                CopiaFaceTop[0] = faceRight[2];
                CopiaFaceTop[1] = faceRight[5];
                CopiaFaceTop[2] = faceRight[8];

                CopiaFaceLeft[6] = faceTop[0];
                CopiaFaceLeft[3] = faceTop[1];
                CopiaFaceLeft[0] = faceTop[2];

                faceLeft[6] = CopiaFaceLeft[6];
                faceLeft[3] = CopiaFaceLeft[3];
                faceLeft[0] = CopiaFaceLeft[0];

                faceDown[8] = CopiaFaceDown[8];
                faceDown[7] = CopiaFaceDown[7];
                faceDown[6] = CopiaFaceDown[6];

                faceRight[2] = CopiaFaceRight[2];
                faceRight[5] = CopiaFaceRight[5];
                faceRight[8] = CopiaFaceRight[8];

                faceTop[0] = CopiaFaceTop[0];
                faceTop[1] = CopiaFaceTop[1];
                faceTop[2] = CopiaFaceTop[2];
                break;

            case 3:
                CopiaFaceTop[2] = faceFront[2];
                CopiaFaceTop[5] = faceFront[5];
                CopiaFaceTop[8] = faceFront[8];

                CopiaFaceBack[2] = faceTop[2];
                CopiaFaceBack[5] = faceTop[5];
                CopiaFaceBack[8] = faceTop[8];

                CopiaFaceDown[2] = faceBack[2];
                CopiaFaceDown[5] = faceBack[5];
                CopiaFaceDown[8] = faceBack[8];

                CopiaFaceFront[2] = faceDown[2];
                CopiaFaceFront[5] = faceDown[5];
                CopiaFaceFront[8] = faceDown[8];

                faceFront[2] = CopiaFaceFront[2];
                faceFront[5] = CopiaFaceFront[5];
                faceFront[8] = CopiaFaceFront[8];

                faceTop[2] = CopiaFaceTop[2];
                faceTop[5] = CopiaFaceTop[5];
                faceTop[8] = CopiaFaceTop[8];

                faceBack[2] = CopiaFaceBack[2];
                faceBack[5] = CopiaFaceBack[5];
                faceBack[8] = CopiaFaceBack[8];

                faceDown[2] = CopiaFaceDown[2];
                faceDown[5] = CopiaFaceDown[5];
                faceDown[8] = CopiaFaceDown[8];

                break;

            case 4:
                CopiaFaceBack[8] = faceLeft[0];
                CopiaFaceBack[7] = faceLeft[1];
                CopiaFaceBack[6] = faceLeft[2];

                CopiaFaceRight[0] = faceBack[8];
                CopiaFaceRight[1] = faceBack[7];
                CopiaFaceRight[2] = faceBack[6];

                CopiaFaceFront[0] = faceRight[0];
                CopiaFaceFront[1] = faceRight[1];
                CopiaFaceFront[2] = faceRight[2];

                CopiaFaceLeft[0] = faceFront[0];
                CopiaFaceLeft[1] = faceFront[1];
                CopiaFaceLeft[2] = faceFront[2];

                faceLeft[0] = CopiaFaceLeft[0];
                faceLeft[1] = CopiaFaceLeft[1];
                faceLeft[2] = CopiaFaceLeft[2];

                faceBack[8] = CopiaFaceBack[8];
                faceBack[7] = CopiaFaceBack[7];
                faceBack[6] = CopiaFaceBack[6];

                faceRight[0] = CopiaFaceRight[0];
                faceRight[1] = CopiaFaceRight[1];
                faceRight[2] = CopiaFaceRight[2];

                faceFront[0] = CopiaFaceFront[0];
                faceFront[1] = CopiaFaceFront[1];
                faceFront[2] = CopiaFaceFront[2];
                break;

            case 5:
                CopiaFaceFront[8] = faceLeft[8];
                CopiaFaceFront[7] = faceLeft[7];
                CopiaFaceFront[6] = faceLeft[6];

                CopiaFaceRight[8] = faceFront[8];
                CopiaFaceRight[7] = faceFront[7];
                CopiaFaceRight[6] = faceFront[6];

                CopiaFaceBack[0] = faceRight[8];
                CopiaFaceBack[1] = faceRight[7];
                CopiaFaceBack[2] = faceRight[6];

                CopiaFaceLeft[8] = faceBack[0];
                CopiaFaceLeft[7] = faceBack[1];
                CopiaFaceLeft[6] = faceBack[2];

                faceLeft[8] = CopiaFaceLeft[8];
                faceLeft[7] = CopiaFaceLeft[7];
                faceLeft[6] = CopiaFaceLeft[6];

                faceFront[8] = CopiaFaceFront[8];
                faceFront[7] = CopiaFaceFront[7];
                faceFront[6] = CopiaFaceFront[6];

                faceRight[8] = CopiaFaceRight[8];
                faceRight[7] = CopiaFaceRight[7];
                faceRight[6] = CopiaFaceRight[6];

                faceBack[0] = CopiaFaceBack[0];
                faceBack[1] = CopiaFaceBack[1];
                faceBack[2] = CopiaFaceBack[2];
                break;
            default:

        }

    }

    public void rotacionarAntiHorario(int indice) {
        for (int i = 0; i < 3; i++) {
            rotacionarHorario(indice);
        }
    }

    public boolean verificarCubo() {
        String[] arrayLetras = {"F", "L", "B", "R", "T", "D"};
        int i = 0;
        for (String[] valor : cubo) {

            for (String valorFace : valor) {

                if (!valorFace.equals(arrayLetras[i])) {

                    return true;
                }
            }
            i++;

        }
        return false;

    }

    public int NumSequencias(char sequencia[]) {
        // 0 = front; 1 = left; 2 = back; 3 = right; 4 = top; 5 = down;
        Object[][] congruencia = {{"F", 0}, {"L", 1}, {"B", 2}, {"R", 3}, {"U", 4}, {"D", 5}};
        Object[][] congruenciaMinuscula = {{"f", 0}, {"l", 1}, {"b", 2}, {"r", 3}, {"u", 4}, {"d", 5}};
        int numSequencia = 0;

        do {
            for (char letra : sequencia) {
                for (Object[] par : congruencia) {
                    if (letra == ((String) par[0]).charAt(0)) {
                        rotacionarHorario((int) par[1]);

                    }
                }
                for (Object[] par : congruenciaMinuscula) {
                    if (letra == ((String) par[0]).charAt(0)) {
                        rotacionarAntiHorario((int) par[1]);

                    }
                }
            }
            numSequencia++;
        } while (verificarCubo());
        return numSequencia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String entrada = scanner.nextLine();
            if (entrada.trim().isEmpty()) {
                continue;
            }

            char[] sequencia = entrada.toCharArray();

            Main cubo = new Main();
            int resultado = cubo.NumSequencias(sequencia);
            System.out.println(resultado);
        }
    }
}
