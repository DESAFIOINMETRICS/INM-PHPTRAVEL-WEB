
class SitePage
    include Capybara::DSL
     
    def acessarPage(site)
        visit site
    end
end


class LoginPage < SitePage
    
    def fazer_Login(email, senha)
        fill_in 'email', with: email
        fill_in 'password', with: senha  
        click_button 'Login'    
    end
end

class CadastroGuestCustomers < LoginPage

      def menuAccounts
        return page.find(:css, 'a[href="#ACCOUNTS"]').click
      end

      def menuGuestCustomers
        return click_link 'GuestCustomers'
      end

      def btAdd
        return click_button 'Add' 
      end

      def fillForm1(firstname, lastname, email, password)
        fill_in 'fname', with: firstname
        fill_in 'lname', with: lastname
        fill_in 'email', with: email
        fill_in 'password', with: password
        end

      def fillForm2(mobileNumber, country, addressOne, addressTwo, status)
        fill_in 'mobile', with: mobileNumber
        fill_in 'address1', with: addressOne 
        fill_in 'address2', with: addressTwo

        find('.select2-container').click
        find('.select2-results-dept-0', text: country).click
    
        select( status, from: 'status')
      end

      def btSubimit
        return click_button 'Submit'
      end
end      