
Dado("que acesso o site da {string}") do |site|                                                                                                                       
    @acessa = SitePage.new
    @acessa.acessarPage(site)                                                                                       
  end                                                                                                                                                                     
                                                                                                                                                                          
  Quando("faço login com usuário {string} e Password {string}") do |email, senha|    
    @login = LoginPage.new
    @login.fazer_Login(email, senha)                                                                                                                                                                 
  end                                                                                                                                                                     
                                                                                                                                                                          
  Quando("deve exibir a pagina inicial logada com a mensagem {string}") do |msglogada|  
    @msglogada = msglogada                                                                                
   expect(page).to have_content @msglogada                                                                                        
  end                                                                                                                                                                     
                                                                                                                                                                          
  Quando("clico em ACCOUNTS no menu lateral") do                                                                                                                          
   @cadgc = CadastroGuestCustomers.new
   @cadgc.menuAccounts                                                                 
  end                                                                                                                                                                     
                                                                                                                                                                          
  Quando("clico na opção GuestCustomers") do
    @cadgc = CadastroGuestCustomers.new                                                                                                                     
    @cadgc.menuGuestCustomers                                                                                                
  end                                                                                                                                                                     
                                                                                                                                                                          
  Quando("Clico no botão Add") do                                                                                                                                         
    @cadgc.btAdd                                                                                      
  end                                                                                                                                                                     
                                                                                                                                                                          
  Quando("preencho os campos First Name {string} Last name {string} Email {string} Password {string}") do |firstname, lastname, email, password|    
    @cadgc.fillForm1(firstname, lastname, email, password)
  end                                                                                                                                                                     
                                                                                                                                                                          
  Quando("preencho os campos  Mobile Number {string} Country {string} AddressOne {string}  AddressTwo {string} Status {string}") do |mobileNumber, country, addressOne, addressTwo, status|                                                                                                                                                   
   @cadgc.fillForm2(mobileNumber, country, addressOne, addressTwo, status)
   end                                                                                                                                                                                                                                                                                                                                      
                                                                                                                                                                          
  Quando("clico no botão Submit") do                                                                                                                                      
    @cadgc.btSubimit                                                                                       
  end                                                                                                                                                                     
                                                                                                                                                                          
  Então("cadastro é realizado com sucesso eo email {string} é exibido no grid") do |okcadastro|
    @okcadastro = okcadastro                                                                                                                        
    expect(page).to have_content @okcadastro                                                                                          
  end                                                                                                                                                                     