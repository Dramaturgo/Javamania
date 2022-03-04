public class Caracol{

  
  //Realiza el algoritmo caracol
  
static void imprimir(int [][] matriz){

        for (int i=0;i<matriz.length;i++){
		for (int j=0;j<matriz[i].length;j++ ) {
			System.out.print(matriz[i][j]+" ");
		}
		System.out.println("");
	}

	}


static void caracol(int m){

int [][] matriz=new int[m][m];


int a1,a2,b1,b2,c1,c2,d1,d2;
int cont=1;

a1=0;a2=m-2;
b1=0;b2=m-2;
c1=m-1;c2=1;
d1=m-1;d2=1;

for(int k=1;k<=m/2;k++){

for (int i=a1;i<=a2;i++ ) matriz[i][b1]=cont++;
for (int i=b1;i<=b2;i++ ) matriz[c1][i]=cont++;
for (int i=c1;i>=c2;i-- ) matriz[i][d1]=cont++;	
for (int i=d1;i>=d2;i-- ) matriz[a1][i]=cont++;	


	a1++;a2--;
    b1++;b2--;
    c1--;c2++;
    d1--;d2++;
}

if(m%2!=0){
matriz[m/2][m/2]=cont;
}
imprimir(matriz);




}

public static void main(String[] args) {
	

caracol(5);


}
}
