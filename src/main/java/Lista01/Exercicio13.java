/*
 * Copyright (C) 2024 Lucas  Reis <lucaslladder@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lista01;
import java.util.Scanner;
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 02/03/24
 * @brief class Exercicio13
 */
public class Exercicio13 {
    public static void main(String[] args) {
        
  Scanner scanner = new Scanner(System.in);

	        int N = scanner.nextInt();
	        scanner.nextLine(); // Consumir a quebra de linha após o inteiro

	        for (int i = 0; i < N; i++) {
	            String linha = scanner.nextLine();

	            // Primeira passada: Deslocar 3 posições para a direita nas letras
	            StringBuilder passada1 = new StringBuilder();
	            for (char c : linha.toCharArray()) {
	                if (Character.isLetter(c)) {
	                    char novoChar = (char) (c + 3);
	                    passada1.append(novoChar);
	                } else {
	                    passada1.append(c);
	                }
	            }

	            // Segunda passada: Inverter a linha
	            StringBuilder passada2 = new StringBuilder(passada1).reverse();

	            // Terceira passada: Deslocar 1 posição para a esquerda a partir da metade
	            StringBuilder passada3 = new StringBuilder();
	            int metade = passada2.length() / 2;
	            for (int j = 0; j < passada2.length(); j++) {
	                char c = passada2.charAt(j);
	                if (j >= metade) {
	                    char novoChar = (char) (c - 1);
	                    passada3.append(novoChar);
	                } else {
	                    passada3.append(c);
	                }
	            }

	            System.out.println(passada3.toString());
	        }

	        scanner.close();
	    }
	}