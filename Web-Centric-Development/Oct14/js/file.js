function verification() {
    var emailBox = document.getElementById("email");
    var nameBox = document.getElementById("name");  
    var ageBox = document.getElementById("age");  
    var probleme = document.getElementById("probleme");
    nameBox.style.outline="initial";

    emailBox.style.outline="initial";
    var noProbleme=true;

if (probleme.hasChildNodes()) 
    {
      probleme.removeChild(probleme.childNodes.item(0));
    }

if(emailBox.value=="" && nameBox.value == "" && ageBox.value == "")
	  {
		 emailBox.style.outline="solid Red";
         probleme.appendChild(document.createTextNode("Please fill the email and the name"));
         nameBox.style.outline="solid Red";
         noProbleme=false; 
		  
	  }	
    else  {if(emailBox.value=="")
	  {
		 emailBox.style.outline="solid Red";
         probleme.appendChild(document.createTextNode("Please fill the email."));
         noProbleme=false; 
		  
	  }		
    
     if(nameBox.value=="")
	  {
		 nameBox.style.outline="solid Red";
         probleme.appendChild(document.createTextNode("Please fill the name."));
         noProbleme=false; 
	  }	
  if(ageBox.value=="")
	  {
		 ageBox.style.outline="solid Red";
         probleme.appendChild(document.createTextNode("Please fill the age."));
         noProbleme=false; 
		  
	  }		  }
		  
		  
		  if(no_probleme){
            document.forms['myform'].submit();      
}
  };
  
  function erase() {

    var emailBox = document.getElementById("email");
    var nameBox = document.getElementById("name");
    var ageeBox = document.getElementById("age");  
    var probleme = document.getElementById("probleme");


	 var isOK = confirm("Are you sure you want to delete? ");
   if(isOK){
    emailBox.style.outline = "initial";
    document.forms['myform'].reset();
     probleme.removeChild(probleme.childNodes.item(0));
   }
   
		 
  };

  
