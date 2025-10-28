function verification() {
    var emailBox = document.getElementById("email");
    var nameBox = document.getElementById("name");
    
    var probleme = document.getElementById("probleme");
    nameBox.style.outline="initial";

    emailBox.style.outline="initial";
    var noProbleme=true;

if (probleme.hasChildNodes()) 
    {
      probleme.removeChild(probleme.childNodes.item(0));
    }

    
       if((emailBox.value=="")) {
        emailBox.style.outline="solid red";
        probleme.appendChild(document.createTextNode("Please fill the email."));
      noProbleme=false;
      } 

      if((nameBox.value=="")) {
        nameBox.style.outline="solid red";
       
        probleme.appendChild(document.createTextNode("Please fill the name."));
      
        noProbleme=false;
      }


     
      if(noProbleme){
      document.forms['myform'].submit();      
    }
  };

  
