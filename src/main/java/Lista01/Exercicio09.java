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
 * @brief class Exercicio09
 */
public class Exercicio09 {
    public static void main(String[] args) {
        
   Scanner sc  = new Scanner(System.in);
		int n,x;
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			int soma =0;
			x=sc.nextInt();
			
			for (int j=1;j<x;j++) {
				if(x%j==0) {
					soma = soma +j;
				}
			}
			
			if(soma ==x) {
				System.out.println(x+ " eh perfeito");
			}
			else {
				System.out.println(x+" nao eh perfeito");
			}
		}
		sc.close();
 
    
    }
}
