/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;

import java.lang.reflect.Array;
import java.util.HashMap;

/**
 *
 * @author wesker
 */
public class DatosYNumeros {
    
    public int RangeRandint(int Min,int Max){
        
        int Rango = Max - Min + 1;
        
        return (int)(Math.random()*Rango)+Min;
    }
   
    
    
    String[] nombres_m = {
    "Mateo", "Agustín", "Joaquín", "Benjamín", "Diego", "Sebastián", "Ignacio", "Francisco", "Matías", "Tomás",
    "Nicolás", "Gabriel", "Alejandro", "Andrés", "Daniel", "Fernando", "Emilio", "Leonardo", "Cristóbal", "Vicente",
    "Juan", "Lucas", "Mauricio", "Manuel", "Rafael", "Eduardo", "Camilo", "Alexis", "Patricio", "Roberto", "Guillermo",
    "Javier", "Ricardo", "Jaime", "Ernesto", "Gonzalo", "Rodrigo", "Arturo", "Cristian", "Álvaro", "Esteban", "Luis",
    "Oscar", "Sergio", "Pedro", "Hugo", "José", "Miguel", "Ariel", "Rubén", "César", "Marcelo", "Israel", "Claudio",
    "Osvaldo", "Nelson", "Ramón", "Freddy", "Marco", "Renato", "Adrián", "Guido", "Hernán", "Jorge", "Sebastián",
    "Felipe", "Víctor", "Carlos", "Orlando", "Leonardo", "Alexis", "Patricio", "Juan Pablo", "Eduardo", "Roberto",
    "Guillermo", "Andrés", "Matías", "Alejandro", "Sebastián", "Francisco", "Ignacio", "Cristóbal", "Benjamín",
    "Emilio", "Diego", "Joaquín", "Mateo", "Tomás", "Nicolás", "Gabriel", "Daniel", "Felipe", "Arturo", "Lucas",
    "Fernando", "Mauricio", "Vicente", "Manuel", "José Antonio", "Felipe", "Jarel", "Maximiliano"
   };
    
    String[] nombresVZ = {
    "Alejandro", "Carlos", "David", "Diego", "Emilio", "Fernando", "Gabriel", "Héctor", "Ignacio", "Javier",
    "Jesús", "Juan", "Luis", "Manuel", "Miguel", "Nicolás", "Oscar", "Pablo", "Pedro", "Raúl",
    "Ricardo", "Roberto", "Santiago", "Sebastián", "Tomás", "Vicente", "Victor", "Wilmer", "Xavier", "Yeferson"
    };
    
    String[] nombresBR = {
            "João", "Pedro", "José", "Carlos", "Lucas", "Gabriel", "Guilherme", "Matheus", "Rafael", "Felipe",
            "Gustavo", "Rodrigo", "Marcelo", "Thiago", "Leonardo", "Bruno", "Diego", "Vitor", "Eduardo", "André",
            "Fernando", "Paulo", "Renato", "Caio", "Igor", "Murilo", "Alexandre", "Ricardo", "Antonio", "Sérgio",
            "Francisco", "Rogério", "Augusto", "Roberto", "Henrique", "Márcio", "Fábio", "Raul", "Adriano", "Arthur",
            "Vinícius", "Miguel", "Luan", "Julio", "Nelson", "Hugo", "Jorge", "Samuel", "Daniel", "Victor",
            "Cristiano", "Alex", "Rui", "Bruno", "Leandro", "Alan", "Edson", "Renan", "Wesley", "Cássio", "Jonathan","Ronaldo","Edson"
        };
    
    String[] nombresAR = {
            "Juan", "Matías", "Santiago", "Agustín", "Federico", "Gonzalo", "Luciano", "Martín", "Nicolás", "Lucas",
            "Tomás", "Francisco", "Diego", "Facundo", "Pablo", "Sebastián", "Maximiliano", "Joaquín", "Alejandro", "Ezequiel",
            "Iván", "Lautaro", "Rodrigo", "Emiliano", "Leandro", "Gabriel", "Hernán", "Bruno", "Ramiro", "Fernando",
            "Julián", "Carlos", "Manuel", "Adrián", "Mariano", "Andrés", "Ricardo", "Hugo", "Jorge", "Raúl",
            "Cristian", "Javier", "Daniel", "Ángel", "Guillermo", "Enzo", "Valentín", "Sergio", "Esteban", "Eduardo",
            "Alejo", "Damián", "Ignacio", "Rafael", "Alberto", "Simón", "Patricio", "Mario", "Felipe", "Lisandro"
    };
    
    String[] nombresUSA = {
    "Michael", "James", "John", "Robert", "David", "William", "Richard", "Charles", "Joseph", "Thomas",
    "Christopher", "Daniel", "Paul", "Mark", "Donald", "George", "Kenneth", "Steven", "Edward", "Brian",
    "Ronald", "Anthony", "Kevin", "Jason", "Matthew", "Gary", "Timothy", "Jose", "Larry", "Jeffrey"
   };
    
    String[] nombresEN = {
    "James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Thomas", "Charles",
    "Christopher", "Daniel", "Matthew", "Anthony", "Mark", "Donald", "Steven", "Paul", "Andrew", "Joshua",
    "Kenneth", "Kevin", "Brian", "George", "Edward", "Ronald", "Timothy", "Jason", "Jeffrey", "Ryan"
};
    
    String[] nombresTUR = {
    "Ahmet", "Mehmet", "Mustafa", "Ali", "Hüseyin", "Hasan", "İbrahim", "Osman", "Murat", "İsmail",
    "Yusuf", "Fatih", "İsmet", "Musa", "Emre", "Can", "Sedat", "Ömer", "Orhan", "Ertuğrul",
    "Barış", "Serkan", "İlker", "Gökhan", "Volkan", "Kerem", "Eren", "Cem", "Tolga", "Umut"
};
    
    String[] nombresITA = {
    "Giovanni", "Mario", "Luigi", "Giuseppe", "Antonio", "Francesco", "Alessandro", "Carlo", "Angelo", "Roberto",
    "Davide", "Luca", "Riccardo", "Alberto", "Michele", "Marco", "Andrea", "Stefano", "Leonardo", "Paolo",
    "Fabio", "Giorgio", "Domenico", "Giulio", "Enrico", "Salvatore", "Simone", "Filippo", "Federico", "Nicola"
};

    String[] nombresRU = {
    "Aleksandr", "Dmitri", "Mikhail", "Ivan", "Sergei", "Andrei", "Aleksei", "Vladimir", "Nikolai", "Oleg",
    "Yaroslav", "Pavel", "Yegor", "Maksim", "Denis", "Artyom", "Kirill", "Artur", "Gleb", "Roman",
    "Timofei", "Stanislav", "Vadim", "Matvei", "Igor", "Anton", "Boris", "Viktor", "Fyodor", "Lev"
    };
    
    // Nombres masculinos japoneses
String[] nombresJP = {
    "Hiroshi", "Takeshi", "Yuki", "Haruto", "Sota", "Ryota", "Kota", "Kaito", "Ren", "Shota",
    "Yuto", "Yuya", "Riku", "Ryuki", "Ryo", "Taiga", "Hayato", "Sosuke", "Rui", "Yuki",
    "Kazuki", "Yuma", "Sora", "Sho", "Daiki", "Takumi", "Koki", "Yusuke", "Tsubasa", "Akira"
};

// Apellidos japoneses
String[] apellidosJP = {
    "Sato", "Suzuki", "Takahashi", "Tanaka", "Watanabe", "Ito", "Yamamoto", "Nakamura", "Kobayashi", "Kato",
    "Yoshida", "Yamada", "Sasaki", "Yamaguchi", "Saito", "Matsumoto", "Inoue", "Kimura", "Hayashi", "Shimizu",
    "Yamazaki", "Mori", "Abe", "Ikeda", "Hashimoto", "Yamashita", "Ogawa", "Nakajima", "Kojima", "Fujita"
};

// Nombres masculinos chinos
String[] nombresCN = {
    "Wei", "Yong", "Lei", "Yuan", "Yang", "Kai", "Cheng", "Tao", "Jian", "Jie",
    "Hong", "Shi", "Xin", "Jun", "Lin", "Ming", "Xiang", "Hao", "Hui", "Gang",
    "Xin", "Zheng", "Peng", "Xue", "Feng", "Zhen", "Sheng", "Xu", "Zhi", "Zhang"
};

// Apellidos chinos
String[] apellidosCN = {
    "Li", "Wang", "Zhang", "Liu", "Chen", "Yang", "Huang", "Zhao", "Zhou", "Wu",
    "Xu", "Sun", "Ma", "Hu", "Guo", "He", "Gao", "Luo", "Lin", "Wang",
    "Xie", "Zheng", "Wu", "Tang", "Yu", "Zhu", "Xiao", "Shen", "Lu", "Han"
};

// Nombres masculinos coreanos
String[] nombresCOR = {
    "Minwoo", "Taehyung", "Jaehyun", "Jonghyun", "Hyunwoo", "Donghyun", "Jinwoo", "Jinhyuk", "Seungmin", "Hyunwoo",
    "Junho", "Seungwoo", "Hyeonwoo", "Minho", "Joon", "Seunghyun", "Yoon", "Sangwoo", "Junsu", "Hyungseok",
    "Sungho", "Junseok", "Jungkook", "Seungjoon", "Seunghee", "Jae", "Dongjun", "Kangmin", "Jisoo", "Dohyun"
};

// Apellidos coreanos
String[] apellidosCOR = {
    "Kim", "Lee", "Park", "Choi", "Jeong", "Yoon", "Kang", "Shin", "Song", "Han",
    "Yang", "Jang", "Kwon", "Moon", "Hong", "Chung", "Yoo", "Suh", "Oh", "Im",
    "Lim", "Cho", "Ryu", "Hwang", "Nam", "Bae", "Gwak", "Ahn", "Seo", "Byun"
};

// Nombres masculinos árabes
String[] nombresAB = {
    "Mohammed", "Ahmed", "Ali", "Abdullah", "Omar", "Youssef", "Khalid", "Hassan", "Abdulaziz", "Abdulrahman",
    "Saeed", "Fahad", "Nasser", "Majed", "Saad", "Sultan", "Hamed", "Tariq", "Saleh", "Hussein",
    "Mansour", "Saud", "Khalifa", "Bandar", "Faisal", "Ahmad", "Turki", "Rashed", "Hamza", "Jaber"
};

// Apellidos árabes
String[] apellidosAB = {
    "Al Saud", "Al Rashid", "Al Khalifa", "Al Sabah", "Al Thani", "Al Maktoum", "Al Nahyan", "Al Qasimi", "Al Jaber", "Al Zayed",
    "Al Nasser", "Al Banna", "Al Sharif", "Al Fayez", "Al Hajjar", "Al Jabri", "Al Mufti", "Al Barak", "Al Abadi", "Al Baghdadi",
    "Al Iraqi", "Al Tajir", "Al Marri", "Al Ameri", "Al Ansari", "Al Khalidi", "Al Shami", "Al Masri", "Al Balushi", "Al Saud"
};


    
    
    String[] nombresAL = {
    "Lukas", "Leon", "Finn", "Paul", "Jonas", "Luis", "Maximilian", "Felix", "Noah", "Elias",
    "Julian", "Tim", "Philipp", "Matthias", "Moritz", "David", "Simon", "Jan", "Fabian", "Tom",
    "Nico", "Daniel", "Alexander", "Ben", "Erik", "Kevin", "Liam", "Luca", "Anton", "Sebastian"
};
    String[] apellidosEN = {
    "Smith", "Jones", "Williams", "Taylor", "Brown", "Davies", "Evans", "Wilson", "Thomas", "Johnson",
    "Robinson", "Wright", "Thompson", "Walker", "White", "Harris", "Clark", "Lewis", "Turner", "Martin",
    "Hall", "Green", "Wood", "Jackson", "Hill", "Shaw", "Fisher", "Bennett", "Cox", "Hughes","Smith", "Brown", "Wilson", "Campbell", "Stewart", "Thomson", "Robertson", "Anderson", "MacDonald", "Scott",
    "Reid", "Murray", "Taylor", "Clark", "Ross", "Watson", "Morrison", "Young", "Mitchell", "Paterson",
    "Murray", "MacLean", "Miller", "Fraser", "Mitchell", "Hughes", "Murphy", "Gibson", "Campbell", "Mackenzie"
};
    
    String[] apellidosTUR = {
    "Yılmaz", "Kaya", "Demir", "Şahin", "Çelik", "Yıldırım", "Kılıç", "Arslan", "Öztürk", "Koç",
    "Aksoy", "Çetin", "Doğan", "Yıldız", "Çalışkan", "Kurt", "Çınar", "Aydın", "Özdemir", "Erdoğan",
    "Karadağ", "Türk", "Toprak", "Kara", "Yavuz", "Ayhan", "Şimşek", "Sarı", "Güneş", "Gül"
};
    
    String[] apellidosITA = {
    "Rossi", "Russo", "Ferrari", "Esposito", "Bianchi", "Romano", "Colombo", "Ricci", "Marino", "Greco",
    "Conti", "Bruno", "Gallo", "De Luca", "Costa", "Mancini", "Giordano", "Rizzo", "Lombardi", "Moretti",
    "Barbieri", "Fontana", "Santoro", "Mariani", "Rinaldi", "Caruso", "Ferrara", "Galli", "Martini", "Leone"
};

// Nombres masculinos indios
String[] nombresIN = {
    "Aarav", "Vivaan", "Vihaan", "Aditya", "Arjun", "Reyansh", "Mohammed", "Aryan", "Ayaan", "Advik",
    "Atharv", "Aadi", "Kabir", "Shaurya", "Anay", "Pranav", "Sai", "Ishaan", "Rudra", "Darsh",
    "Dhruv", "Aaryan", "Krishna", "Veer", "Ritvik", "Vedant", "Rohan", "Aryan", "Yash", "Parth"
};

// Apellidos indios
String[] apellidosIN = {
    "Patel", "Sharma", "Singh", "Kumar", "Jain", "Gupta", "Rao", "Desai", "Shah", "Mehta",
    "Shah", "Trivedi", "Yadav", "Dave", "Joshi", "Mehta", "Shah", "Patel", "Shah", "Shah",
    "Gupta", "Patel", "Shah", "Shah", "Patel", "Patel", "Shah", "Patel", "Shah", "Shah"
};
// Nombres masculinos indonesios
String[] nombresIDO = {
    "Muhammad", "Ahmad", "Irfan", "Rizky", "Nur", "Fahri", "Alif", "Rizki", "Hadi", "Bagus",
    "Rendi", "Fajar", "Galang", "Yoga", "Faisal", "Ryan", "Wahyu", "Adi", "Dika", "Firman",
    "Hendra", "Dimas", "Bayu", "Yogi", "Dedi", "Aldi", "Aldo", "Arief", "Indra", "Iqbal"
};

// Apellidos indonesios
String[] apellidosIDO = {
    "Santoso", "Susanto", "Liem", "Wijaya", "Lim", "Tan", "Surya", "Hadi", "Hidayat", "Hartono",
    "Halim", "Pratama", "Wahyudi", "Kurniawan", "Kusuma", "Purnama", "Jaya", "Setiawan", "Hendra", "Gunawan",
    "Saputra", "Permana", "Yusuf", "Rahman", "Dharma", "Siregar", "Kusumo", "Saputro", "Wicaksono", "Yulianto"
};

// Nombres masculinos tailandeses
String[] nombresTAIL = {
    "Sorapong", "Thawatchai", "Thana", "Suthipong", "Prasert", "Surapong", "Somchai", "Tanapon", "Sakchai", "Sakda",
    "Wanlop", "Pongsak", "Nattapong", "Anupong", "Anurak", "Boonmee", "Bunjong", "Chaiwat", "Chalerm", "Chanchai",
    "Chayut", "Chokchai", "Chokdee", "Cholchai", "Dechawat", "Khajorn", "Khamphun", "Kittisak", "Kraisorn", "Narin"
};

// Apellidos tailandeses
String[] apellidosTAIL = {
    "Pholdee", "Wongwiwat", "Klinsukhon", "Ratanasuwat", "Meechai", "Sriyapan", "Srichai", "Yamsawat", "Supharat", "Phansamrit",
    "Wiwatwong", "Chaithong", "Dumrong", "Sriwichai", "Prasong", "Chinwong", "Srinet", "Yindee", "Chuthong", "Sriphan",
    "Maknoi", "Prachuab", "Thongtae", "Sornchai", "Chantan", "Boonkum", "Phongphit", "Chansuk", "Srichom", "Wutthisan"
};

    
    
    String[] apellidos_chilenos = {
    "González", "Rodríguez", "López", "Martínez", "Pérez", "Hernández", "Gómez", "Flores", "Díaz", "Muñoz",
    "Vargas", "Soto", "Silva", "Contreras", "Reyes", "Álvarez", "Morales", "Castro", "Rojas", "Fuentes",
    "Carrasco", "Ortiz", "Vásquez", "Herrera", "Rivera", "Araya", "Jiménez", "Espinoza", "Valenzuela",
    "Pacheco", "Molina", "Sánchez", "Ramírez", "Bravo", "Figueroa", "Castillo", "Cortés", "Navarro",
    "Lira", "Torres", "Miranda", "Palma", "Moreno", "Fernández", "Zúñiga", "Orellana", "Alvarado",
    "Aguilera", "Sepúlveda", "Tapia", "Gutiérrez", "Leiva", "Salazar", "Rivas", "Cáceres", "Herrero",
    "Cárdenas", "Pizarro", "Romero", "Vergara", "Ibáñez", "Campos", "Maldonado", "Navarrete", "Figueroa",
    "Cisternas", "Venegas", "Villanueva", "Ríos", "Farías", "Godoy", "Pavez", "Carvajal", "Zapata",
    "Henríquez", "Arancibia", "Sanhueza", "Arellano", "Quiroz", "Parra", "Briones", "Carmona", "Pizarro",
    "Ovalle", "Duarte", "Fernández", "Gallardo", "Cabrera", "Alarcón", "Moya", "Ojeda", "Medina",
    "Romero", "Garrido", "González", "Rodríguez", "López", "Martínez", "Pérez", "Hernández", "Gómez"
    };
    
    String[] apellidosBR = {
            "Silva", "Santos", "Oliveira", "Souza", "Pereira", "Costa", "Ferreira", "Alves", "Ribeiro", "Gomes",
            "Lima", "Carvalho", "Araújo", "Martins", "Rocha", "Barbosa", "Mendonça", "Melo", "Cardoso", "Pires",
            "Teixeira", "Cavalcante", "Monteiro", "Dias", "Castro", "Almeida", "Freitas", "Vieira", "Rezende", "Nunes",
            "Rodrigues", "Machado", "Moraes", "Fonseca", "Santana", "Ramos", "Campos", "Moreira", "Sousa", "Corrêa",
            "Peixoto", "Pinheiro", "Nascimento", "Azevedo", "Andrade", "Reis", "Coelho", "Rosa", "Cruz", "Borges",
            "Duarte", "Faria", "Brito", "Moura", "Figueiredo", "Pinto", "Neves", "Barros", "Sales", "Tavares"
    };
    
     String[] apellidosAR = {
            "González", "Rodríguez", "Gómez", "Fernández", "López", "Díaz", "Martínez", "Pérez", "García", "Sánchez",
            "Romero", "Sosa", "Torres", "Álvarez", "Ruiz", "Ramírez", "Flores", "Acosta", "Benítez", "Medina",
            "Herrera", "Aguirre", "Ponce", "Morales", "Castro", "Ortiz", "Gutiérrez", "Rojas", "Molina", "Silva",
            "Castillo", "Ortiz", "Núñez", "Cabrera", "Ramos", "Ferreyra", "Méndez", "Paz", "Rivera", "Suárez",
            "Peralta", "Luna", "Vera", "Giménez", "Domínguez", "Carrizo", "Rojas", "Villalba", "Correa", "Chávez",
            "Maldonado", "Arias", "Espinoza", "Vargas", "Ríos", "Vega", "Ferreira", "Hernández", "Godoy", "Moreno"
        };
     
     String[] apellidosVZ = {
    "Alvarez", "Blanco", "Cabrera", "Castillo", "Contreras", "Díaz", "Fernández", "García", "Gómez", "González",
    "Hernández", "Jiménez", "López", "Martínez", "Mendoza", "Morales", "Núñez", "Ortega", "Pérez", "Ramírez",
    "Ramos", "Reyes", "Rodríguez", "Rojas", "Sánchez", "Torres", "Vargas", "Vázquez", "Vega", "Zambrano"
   };
     
     String[] apellidosBV = {
    "Alarcón", "Alvarado", "Arias", "Álvarez", "Arce", "Bautista", "Cabrera", "Cardozo", "Castillo", "Céspedes",
    "Chávez", "Cordero", "Cruz", "Espinoza", "Fernández", "García", "González", "Gutiérrez", "López", "Martínez",
    "Mendoza", "Molina", "Montes", "Morales", "Navarro", "Ortiz", "Pérez", "Ramos", "Rodríguez", "Sánchez","Mamani","Pacha"
   };
     
     String[] apellidosUSA = {
    "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
    "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin",
    "Lee", "Perez", "Thompson", "White", "Harris", "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson"
};
     
     String[] apellidosAL = {
    "Müller", "Schmidt", "Schneider", "Fischer", "Weber", "Meyer", "Wagner", "Becker", "Schulz", "Hoffmann",
    "Schäfer", "Koch", "Bauer", "Richter", "Klein", "Wolf", "Schröder", "Neumann", "Schwarz", "Zimmermann",
    "Braun", "Krüger", "Hofmann", "Hartmann", "Lange", "Schmitt", "Werner", "Schmitz", "Krause", "Meier"
};
     
     String[] apellidosRU = {
    "Ivanov", "Smirnov", "Kuznetsov", "Popov", "Vasiliev", "Petrov", "Sokolov", "Mikhailov", "Novikov", "Fyodorov",
    "Morozov", "Volkov", "Alekseev", "Lebedev", "Semyonov", "Yegorov", "Pavlov", "Kozlov", "Stepanov", "Nikolaev",
    "Orlov", "Andreev", "Makarov", "Nikitin", "Zakharov", "Zaitsev", "Solovyov", "Borisov", "Zhukov", "Kudryavtsev"
};
     
    
    String[] Continentes = {"America","America norte centro","Europa","Asia"};

    // 8 ligas x continente
    
    String[] LigasAmerica = {"Liga Chilena","Liga Brasil","Liga Argentina","Liga Venezuela","Liga Perú","Liga Uruguay","Liga Bolivia","Liga Colombia"};
    
    String[] LigasAmericaNorteCentro = {"Liga MX","MLS","Liga Costa rica","Liga El Salvador","Liga Guatemala","Liga Cuba","Liga Panama","Liga Honduras"};
    
    String[] LigasEuropa = {"Liga España","Premier League","Liga Italia","Liga Portugal","Liga Rusa","Liga Alemania","Liga Escocia","Liga Turquia"};
    
    String[] LigasAsia = {"Liga Japonesa","Liga China","Liga Coreana","Liga Arabia Saudita","Liga Australia","Liga India","Liga Indonesia","Liga Tailandia"};
    //Solo 16 equipos por liga
    
    String[] paises = {
    "Chile", "Brasil", "Argentina", "Venezuela", "Peru", "Uruguay", "Bolivia", "Colombia",
    "Mexico", "Estados Unidos", "Costa Rica", "El Salvador", "Guatemala", "Cuba", "Panama", "Honduras",
    "Espana", "Inglaterra", "Italia", "Portugal", "Rusia", "Alemania", "Escocia", "Turquia",
    "Japon", "China", "Corea", "Arabia saudita", "Australia", "India", "Indonesia", "Tailandia"
    };
    
    String[] equiposJP = {
    "Kashima Antlers", "Yokohama F. Marinos", "Urawa Red Diamonds", "Gamba Osaka", "FC Tokyo", "Kawasaki Frontale",
    "Nagoya Grampus", "Sagan Tosu", "Vissel Kobe", "Sanfrecce Hiroshima", "Cerezo Osaka", "Shimizu S-Pulse",
    "Consadole Sapporo", "Vegalta Sendai", "Shonan Bellmare", "Oita Trinita"
};

    String[] equiposCN = {
    "Guangzhou Evergrande", "Beijing Guoan", "Shanghai SIPG", "Jiangsu Suning", "Shandong Luneng", "Dalian Professional",
    "Hebei China Fortune", "Tianjin TEDA", "Chongqing Lifan", "Guangzhou City", "Wuhan Zall", "Henan Songshan Longmen",
    "Qingdao FC", "Shanghai Shenhua", "Cangzhou Mighty Lions", "Changchun Yatai"
};
    
    String[] equiposCOR = {
    "Jeonbuk Hyundai Motors", "Ulsan Hyundai", "Suwon Samsung Bluewings", "FC Seoul", "Pohang Steelers", "Daegu FC",
    "Gangwon FC", "Seongnam FC", "Incheon United", "Jeju United", "Gwangju FC", "Gimcheon Sangmu", "Busan IPark",
    "Daejeon Hana Citizen", "Chungnam Asan FC", "Ansan Greeners"
};

    String[] equiposAB = {
    "Al Hilal", "Al Nassr", "Al Ahli", "Al Ittihad", "Al Shabab", "Al Taawon", "Al Fateh", "Al Raed",
    "Al Hazm", "Al Batin", "Al Adalah", "Abha Club", "Al Wehda", "Al Ettifaq", "Al Feiha", "Damac FC"
};
    
    String[] equiposAUS = {
    "Sydney FC", "Melbourne Victory", "Western Sydney Wanderers", "Melbourne City FC", "Adelaide United", "Brisbane Roar",
    "Perth Glory", "Western United FC", "Central Coast Mariners", "Newcastle Jets", "Macarthur FC", "Wellington Phoenix",
    "South Melbourne", "Sydney Olympic", "Perth SC", "Melbourne Knights"
};


    String[] equiposIN = {
    "Mumbai City FC", "ATK Mohun Bagan", "Bengaluru FC", "Kerala Blasters FC", "FC Goa", "Jamshedpur FC",
    "Hyderabad FC", "NorthEast United FC", "Chennaiyin FC", "Odisha FC", "East Bengal FC", "Punjab FC",
    "Aizawl FC", "Churchill Brothers SC", "Real Kashmir FC", "Sudeva Delhi FC"
};
    
    String[] equiposIDO = {
    "Bali United", "Persija Jakarta", "Arema FC", "PSM Makassar", "Persipura Jayapura", "PSIS Semarang",
    "Persib Bandung", "Persebaya Surabaya", "PSS Sleman", "Madura United", "Persela Lamongan", "Bhayangkara Solo FC",
    "Barito Putera", "PS TIRA Persikabo", "PS Barito Putera", "Semen Padang FC"
};

    String[] equiposTAIL = {
    "Buriram United", "Port FC", "BG Pathum United", "Muangthong United", "Chiangrai United", "Chonburi FC",
    "Ratchaburi FC", "Rayong FC", "Nakhon Ratchasima FC", "Samut Prakan City", "Trat FC", "Police Tero FC",
    "Bangkok United", "Chiangmai FC", "Suphanburi FC", "Ubon UMT United"
};


    
    
    
    
    
    String[] EquiposChile = {
            "Universidad de Chile",
            "Universidad Católica",
            "Cobreloa",
            "Palestino",
            "Audax Italiano",
            "Unión Española",
            "O'Higgins",
            "Huachipato",
            "Everton",
            "Santiago Wanderers",
            "Deportes Iquique",
            "Cobresal",
            "Ñublense",
            "Curicó Unido",
            "Deportes La Serena",
            "Colo-Colo"
        };
    
    String[] EquiposBrasil = {
            "Flamengo",
            "Palmeiras",
            "Santos",
            "São Paulo",
            "Corinthians",
            "Grêmio",
            "Internacional",
            "Cruzeiro",
            "Atlético Mineiro",
            "Botafogo",
            "Vasco da Gama",
            "Fluminense",
            "Athletico Paranaense",
            "Bahia",
            "Ceará",
            "Fortaleza"
        };
    
    String[] equiposAR = {
    "River Plate",
    "Boca Juniors",
    "Independiente",
    "Racing Club",
    "San Lorenzo",
    "Huracán",
    "Vélez Sarsfield",
    "Argentinos Juniors",
    "Estudiantes de La Plata",
    "Gimnasia y Esgrima La Plata",
    "Newell's Old Boys",
    "Rosario Central",
    "Talleres",
    "Belgrano",
    "Colón",
    "Unión"
     };
    
    String[] equiposCostaRica = {
    "Deportivo Saprissa",
    "LD Alajuelense",
    "CS Herediano",
    "Municipal Grecia",
    "San Carlos",
    "Sporting FC",
    "Santos de Guápiles",
    "Municipal Pérez Zeledón",
    "Jicaral Sercoba",
    "AD Guanacasteca",
    "Cartaginés",
    "Zeledon",
    "Limón FC",
    "Puntarenas FC",
    "Carmelita",
    "Universitarios CR"
};
    
    String[] equiposVZ = {
    "Caracas FC",
    "Deportivo Táchira",
    "Zamora FC",
    "Deportivo La Guaira",
    "Estudiantes de Mérida",
    "Mineros de Guayana",
    "Aragua FC",
    "Portuguesa FC",
    "Academia Puerto Cabello",
    "Carabobo FC",
    "Monagas SC",
    "Atlético Venezuela",
    "Metropolitanos FC",
    "Trujillanos FC",
    "Llaneros de Guanare",
    "Zulia FC"
};
    
    String[] equiposUR = {
    "Nacional",
    "Peñarol",
    "Defensor Sporting",
    "Danubio",
    "Liverpool",
    "Cerro Largo",
    "Fénix",
    "Montevideo Wanderers",
    "Plaza Colonia",
    "Boston River",
    "River Plate Uruguay",
    "Rentistas",
    "Deportivo Maldonado",
    "Cerro",
    "Progreso",
    "Albion"
};
    
    String[] equiposPR = {
    "Alianza Lima",
    "Universitario",
    "Sporting Cristal",
    "FBC Melgar",
    "Sport Huancayo",
    "Cienciano",
    "UTC",
    "Cusco FC",
    "Deportivo Municipal",
    "Carlos A. Mannucci",
    "César Vallejo",
    "Binacional",
    "Sport Boys",
    "Ayacucho FC",
    "Academia Cantolao",
    "Alianza Atlético"
};
    String[] equiposBV = {
    "The Strongest",
    "Bolívar",
    "Jorge Wilstermann",
    "Oriente Petrolero",
    "Blooming",
    "Always Ready",
    "Royal Pari",
    "San José",
    "Nacional Potosí",
    "Real Potosí",
    "Guabirá",
    "Real Santa Cruz",
    "Aurora",
    "Real Tomayapo",
    "Independiente Petrolero",
    "Universitario de Vinto"
};
    
    String[] equiposCOLO = {
    "Atlético Nacional",
    "Independiente Santa Fe",
    "Millonarios",
    "Deportivo Cali",
    "América de Cali",
    "Junior",
    "Once Caldas",
    "Deportes Tolima",
    "Atlético Junior",
    "Deportivo Pasto",
    "Envigado FC",
    "La Equidad",
    "Alianza Petrolera",
    "Atlético Bucaramanga",
    "Deportivo Pereira",
    "Boyacá Chicó"
};
    String[] equiposLigaMX = {
    "América",
    "Guadalajara (Chivas)",
    "Cruz Azul",
    "Pumas UNAM",
    "Monterrey",
    "Tigres UANL",
    "Santos Laguna",
    "Toluca",
    "León",
    "Pachuca",
    "Atlas",
    "Querétaro",
    "Tijuana",
    "Atlético San Luis",
    "Necaxa",
    "Mazatlán FC"
};
    
    String[] equiposMLS = {
    "Atlanta United",
    "Chicago Fire",
    "FC Cincinnati",
    "Columbus Crew",
    "DC United",
    "Inter Miami",
    "CF Montréal",
    "New England Revolution",
    "New York City FC",
    "New York Red Bulls",
    "Orlando City SC",
    "Philadelphia Union",
    "Toronto FC",
    "Colorado Rapids",
    "FC Dallas",
    "Houston Dynamo"
};
    String[] equiposElSalvador = {
    "Alianza FC",
    "CD Águila",
    "CD FAS",
    "Santa Tecla FC",
    "Municipal Limeño",
    "Chalatenango",
    "Isidro Metapán",
    "Jocoro FC",
    "Atlético Marte",
    "11 Deportivo",
    "Sonsonate FC",
    "Luis Ángel Firpo",
    "AD Chalatenango",
    "CD Dragón",
    "Once Lobos",
    "CD Platense"
};

    String[] equiposGuatemala = {
    "Comunicaciones",
    "CSD Municipal",
    "Antigua GFC",
    "Xelajú MC",
    "Cobán Imperial",
    "Deportivo Iztapa",
    "Santa Lucía Cotzumalguapa",
    "Malacateco",
    "Guastatoya",
    "Achuapa",
    "Nueva Concepción",
    "Siquinalá",
    "Mixco",
    "Sanarate",
    "Petapa",
    "Universidad SC"
};

    
    String[] equiposCuba = {
    "FC Santiago de Cuba",
    "FC Villa Clara",
    "FC Ciego de Ávila",
    "FC Camagüey",
    "FC Granma",
    "FC La Habana",
    "FC Isla de la Juventud",
    "FC Las Tunas",
    "FC Matanzas",
    "FC Pinar del Río",
    "FC Sancti Spíritus",
    "FC Guantánamo",
    "FC Holguín",
    "FC Cienfuegos",
    "FC Artemisa",
    "FC Mayabeque"
};

    
    String[] equiposPanama = {
    "Tauro FC",
    "Plaza Amador",
    "San Francisco FC",
    "Árabe Unido",
    "CAI La Chorrera",
    "CD Universitario",
    "Sporting San Miguelito",
    "Alianza FC",
    "Atlético Chiriquí",
    "CD Árabe Unido",
    "Santa Gema FC",
    "Chepo FC",
    "Río Abajo FC",
    "Independiente",
    "Chorrillo FC",
    "CD Centenario"
};

    String[] equiposHonduras = {
    "CD Olimpia",
    "CD Motagua",
    "Real España",
    "CD Marathón",
    "UPNFM",
    "Honduras Progreso",
    "Vida",
    "Real Sociedad",
    "Platense",
    "Juticalpa",
    "Lobos UPNFM",
    "Real de Minas",
    "Victoria",
    "Deportes Savio",
    "Parrillas One",
    "Atlético Choloma"
};
    
    String[] equiposEspana = {
    "Real Madrid",
    "Barcelona",
    "Atlético Madrid",
    "Sevilla",
    "Valencia",
    "Real Betis",
    "Real Sociedad",
    "Villarreal",
    "Athletic Bilbao",
    "Getafe",
    "Espanyol",
    "Celta Vigo",
    "Osasuna",
    "Granada",
    "Levante",
    "Mallorca"
};
    
    String[] equiposInglaterra = {
    "Manchester United",
    "Manchester City",
    "Liverpool",
    "Chelsea",
    "Arsenal",
    "Tottenham Hotspur",
    "Leicester City",
    "West Ham United",
    "Everton",
    "Aston Villa",
    "Newcastle United",
    "Leeds United",
    "Southampton",
    "Crystal Palace",
    "Wolverhampton Wanderers",
    "Brighton & Hove Albion"
};

    String[] equiposItalia = {
    "Juventus",
    "Inter Milan",
    "AC Milan",
    "Napoli",
    "AS Roma",
    "Lazio",
    "Atalanta",
    "Fiorentina",
    "Torino",
    "Sampdoria",
    "Genoa",
    "Bologna",
    "Udinese",
    "Sassuolo",
    "Cagliari",
    "Hellas Verona"
};
    String[] equiposPortugal = {
    "Porto",
    "Benfica",
    "Sporting CP",
    "Braga",
    "Vitória de Guimarães",
    "Boavista",
    "Marítimo",
    "Belenenses",
    "Paços de Ferreira",
    "Gil Vicente",
    "Santa Clara",
    "Moreirense",
    "Tondela",
    "Estoril Praia",
    "Portimonense",
    "Famalicão"
};
    
    String[] equiposRusia = {
    "Zenit St. Petersburg",
    "CSKA Moscow",
    "Spartak Moscow",
    "Lokomotiv Moscow",
    "Krasnodar",
    "Rubin Kazan",
    "Dynamo Moscow",
    "Rostov",
    "Akhmat Grozny",
    "Ural",
    "Sochi",
    "Arsenal Tula",
    "Khimki",
    "Ufa",
    "Tambov",
    "Orenburg"
};
    
    String[] equiposAlemania = {
    "Bayern Munich",
    "Borussia Dortmund",
    "RB Leipzig",
    "Bayer Leverkusen",
    "Borussia Mönchengladbach",
    "Wolfsburg",
    "Eintracht Frankfurt",
    "Hertha Berlin",
    "Hoffenheim",
    "Schalke 04",
    "Stuttgart",
    "Werder Bremen",
    "Freiburg",
    "Mainz 05",
    "Augsburg",
    "Union Berlin"
};
    String[] equiposEscocia = {
    "Celtic",
    "Rangers",
    "Aberdeen",
    "Hibernian",
    "Hearts",
    "Motherwell",
    "Dundee United",
    "St Johnstone",
    "Livingston",
    "St Mirren",
    "Ross County",
    "Dundee FC",
    "Kilmarnock",
    "Hamilton Academical",
    "Partick Thistle",
    "Inverness Caledonian Thistle"
};
    
    String[] equiposTurquia = {
    "Galatasaray",
    "Fenerbahçe",
    "Beşiktaş",
    "Trabzonspor",
    "Başakşehir",
    "Antalyaspor",
    "Alanyaspor",
    "Sivasspor",
    "Göztepe",
    "Konyaspor",
    "Kayserispor",
    "Gaziantep",
    "Rizespor",
    "Hatayspor",
    "Adana Demirspor",
    "Yeni Malatyaspor"
};
    
    public String[] getEquipoPaises(String Pais){
        HashMap<String,String[]> EquiposPaises = new HashMap<>();
        
        EquiposPaises.put("Chile", EquiposChile);
        EquiposPaises.put("Argentina",equiposAR);
        EquiposPaises.put("Brasil",EquiposBrasil);
        EquiposPaises.put("Venezuela",equiposVZ);
        EquiposPaises.put("Uruguay",equiposUR);
        EquiposPaises.put("Peru",equiposPR);
        EquiposPaises.put("Bolivia",equiposBV);
        EquiposPaises.put("Estados Unidos",equiposMLS);
        EquiposPaises.put("Honduras",equiposHonduras);
        EquiposPaises.put("El Salvador",equiposElSalvador);
        EquiposPaises.put("Costa Rica",equiposCostaRica);
        EquiposPaises.put("Mexico",equiposLigaMX);
        EquiposPaises.put("Panama",equiposPanama);
        EquiposPaises.put("Cuba",equiposCuba);
        EquiposPaises.put("Colombia",equiposCOLO);
        EquiposPaises.put("Guatemala",equiposGuatemala);
        
        EquiposPaises.put("Espana",equiposEspana);
        EquiposPaises.put("Escocia",equiposEscocia);
        EquiposPaises.put("Inglaterra",equiposInglaterra);
        EquiposPaises.put("Portugal",equiposPortugal);
        EquiposPaises.put("Rusia",equiposRusia);
        EquiposPaises.put("Alemania",equiposAlemania);
        EquiposPaises.put("Turquia",equiposTurquia);
        EquiposPaises.put("Italia",equiposItalia);
        
        EquiposPaises.put("Japon", equiposJP);
        EquiposPaises.put("China", equiposCN);
        EquiposPaises.put("Corea", equiposCOR);
        EquiposPaises.put("Arabia saudita", equiposAB);
        EquiposPaises.put("Australia", equiposAUS);
        EquiposPaises.put("India", equiposIN);
        EquiposPaises.put("Indonesia", equiposIDO);
        EquiposPaises.put("Tailandia", equiposTAIL);
        
        return EquiposPaises.get(Pais);
    }
    
    
    
    
    
    
    
    
    
    
    String[] Posiciones = {"Mediocampista","Defensa","Atacante"};
    
    public String RandomNombreMasc(){
        return nombres_m[RangeRandint(0,nombres_m.length-1)];
    }
    
    
    public String RandomApellido(){
        return apellidos_chilenos[RangeRandint(0,apellidos_chilenos.length-1)];
    }
    
    public String RetornarRandomString(String[] x){
        return x[RangeRandint(0,x.length-1)];
    }
    
    public int getMax(int[] x){
        int Max = x[0];
        for (int g : x){
            if (g>Max){
                Max = g;
            }
        }
        return Max;
    }
    
    public double getMean(int[] x){
        double Gagrit = 0;
        
        for (int g : x){
            Gagrit+=g;
        }
        return Gagrit/x.length;
    }
    
    public String getRandomNombrePais(String Pais){
        HashMap<String,String> Names = new HashMap<>();
        Names.put("Chile", RetornarRandomString(nombres_m));
        Names.put("Brasil", RetornarRandomString(nombresBR));
        Names.put("Argentina", RetornarRandomString(nombresAR));
        Names.put("Venezuela", RetornarRandomString(nombresVZ));
        Names.put("Uruguay", RetornarRandomString(nombresAR));
        Names.put("Peru", RetornarRandomString(nombres_m));
        Names.put("Bolivia",RetornarRandomString(nombres_m));
        Names.put("Colombia",RetornarRandomString(nombres_m));
        
        
        Names.put("Estados Unidos",RetornarRandomString(nombresUSA));
        Names.put("Honduras",RetornarRandomString(nombres_m));
        Names.put("El Salvador",RetornarRandomString(nombres_m));
        Names.put("Costa Rica",RetornarRandomString(nombres_m));
        Names.put("Mexico",RetornarRandomString(nombres_m));
        Names.put("Panama",RetornarRandomString(nombres_m));
        Names.put("Cuba",RetornarRandomString(nombres_m));
        Names.put("Guatemala",RetornarRandomString(nombres_m));
        
        
        Names.put("Espana", RetornarRandomString(nombres_m));
        Names.put("Escocia", RetornarRandomString(nombresEN));
        Names.put("Inglaterra", RetornarRandomString(nombresEN));
        Names.put("Portugal", RetornarRandomString(nombresBR));
        Names.put("Rusia", RetornarRandomString(nombresRU));
        Names.put("Alemania", RetornarRandomString(nombresAL));
        Names.put("Turquia", RetornarRandomString(nombresTUR));
        Names.put("Italia", RetornarRandomString(nombresITA));
        
        
         Names.put("Japon", RetornarRandomString(nombresJP));
        Names.put("China", RetornarRandomString(nombresCN));
        Names.put("Corea", RetornarRandomString(nombresCOR));
        Names.put("Arabia saudita", RetornarRandomString(nombresAB));
        Names.put("Australia", RetornarRandomString(nombresEN));
        Names.put("India", RetornarRandomString(nombresIN));
        Names.put("Indonesia", RetornarRandomString(nombresIDO));
        Names.put("Tailandia", RetornarRandomString(nombresTAIL));

        
        
        
        return Names.get(Pais);
    }
    
    public String getRandomAppPais(String Pais){
        HashMap<String,String> Names = new HashMap<>();
        //------AMERICA 
        Names.put("Chile", RetornarRandomString(apellidos_chilenos));
        Names.put("Brasil", RetornarRandomString(apellidosBR));
        Names.put("Argentina", RetornarRandomString(apellidosAR));
        Names.put("Venezuela", RetornarRandomString(apellidosVZ));
        Names.put("Uruguay", RetornarRandomString(apellidosAR));
        Names.put("Peru", RetornarRandomString(apellidos_chilenos));
        Names.put("Bolivia", RetornarRandomString(apellidosBV));
        Names.put("Colombia",RetornarRandomString(apellidos_chilenos));
        
        //--AMERICA NORTE CENTRO
        Names.put("Estados Unidos",RetornarRandomString(apellidosUSA));
        Names.put("Honduras",RetornarRandomString(apellidos_chilenos));
        Names.put("El Salvador",RetornarRandomString(apellidos_chilenos));
        Names.put("Costa Rica",RetornarRandomString(apellidos_chilenos));
        Names.put("Mexico",RetornarRandomString(apellidos_chilenos));
        Names.put("Panama",RetornarRandomString(apellidos_chilenos));
        Names.put("Cuba",RetornarRandomString(apellidos_chilenos));
        Names.put("Guatemala",RetornarRandomString(apellidos_chilenos));
        
        //--Europa--
        
        Names.put("Espana", RetornarRandomString(apellidos_chilenos));
        Names.put("Escocia", RetornarRandomString(apellidosEN));
        Names.put("Inglaterra", RetornarRandomString(apellidosEN));
        Names.put("Portugal", RetornarRandomString(apellidosBR));
        Names.put("Rusia", RetornarRandomString(apellidosRU));
        Names.put("Alemania", RetornarRandomString(apellidosAL));
        Names.put("Turquia", RetornarRandomString(apellidosTUR));
        Names.put("Italia", RetornarRandomString(apellidosITA));
        
        //--Asia--
        Names.put("Japon", RetornarRandomString(apellidosJP));
        Names.put("China", RetornarRandomString(apellidosCN));
        Names.put("Corea", RetornarRandomString(apellidosCOR));
        Names.put("Arabia saudita", RetornarRandomString(apellidosAB));
        Names.put("Australia", RetornarRandomString(apellidosEN));
        Names.put("India", RetornarRandomString(apellidosIN));
        Names.put("Indonesia", RetornarRandomString(apellidosIDO));
        Names.put("Tailandia", RetornarRandomString(apellidosTAIL));

        
        
        return Names.get(Pais);
    }
    
    
    
    
    
    
}
