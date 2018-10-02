public class latihan {

	public static void main(String[]args){
		//testing
		String pt = "ANDI AMIRUL ASNAN CIRUA";
		System.out.println(pt);
		
		String ct = encript(pt);
		System.out.println("HASIL ENKRIPISI :"+ct);
		
		String pt1 = decript(ct);
		System.out.println("HASIL DEKRIPSI  :"+pt1);
		
		
	}
	public static final String[] pt = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," "};
	public static final String[] ct = {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"," "};
	
	
	public static String encript(String plaintext){
		String ciphertext = "";
		//mencari sepanjang kata
		for(int i=0 ; i<plaintext.length(); i++){
			String s0 = plaintext.substring(i, i+1);
			String s1 = " ";							//jika tidak ada kata di index array
			//
			for(int j=0; j<pt.length; j++){				//mengecek adakah huruf yang di cari terdapat di index
				if(s0.equals(pt[j])){					//jika sesuai hurufnya dari index pt maka diterjemahkan ke ct
					s1 = ct[j];
					break;
				}
			}
			ciphertext+=s1;
		}
				
		return ciphertext;
	}
	public static String decript(String ciphertext){
		String plaintext = "";
		//mencari sepanjang kata
				for(int i=0 ; i<ciphertext.length(); i++){
					String s0 = ciphertext.substring(i, i+1);
					String s1 = " ";							//jika tidak ada kata di index array
					//
					for(int j=0; j<ct.length; j++){				//mengecek adakah huruf yang di cari terdapat di index
						if(s0.equals(ct[j])){					//jika sesuai hurufnya dari index pt maka diterjemahkan ke ct
							s1 = pt[j];
							break;
						}
					}
					plaintext+=s1;
				}
		return plaintext;
	}
}
