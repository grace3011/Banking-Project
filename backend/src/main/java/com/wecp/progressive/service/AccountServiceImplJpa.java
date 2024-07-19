// package com.wecp.progressive.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.wecp.progressive.entity.Accounts;
// import com.wecp.progressive.exception.AccountNotFoundException;
// import com.wecp.progressive.repository.AccountRepository;


// @Service
// public class AccountServiceImplJpa {
//     @Autowired
//     private AccountRepository accountRepository;

//     public List<Accounts> getAllAccounts(){
//      return accountRepository.findAll();
//     }
//     public Accounts getAccountById(Integer account_id){
//         Accounts acc= accountRepository.findById(account_id).orElse(null);
//         if(acc==null){
//             throw new AccountNotFoundException("error");
//         }
//         return acc;

//     }
//     public Accounts getAccountsByUser(Integer customerId){
//        return accountRepository.findById(customerId).orElse(null);

//     }
//     public Integer addAccount(Accounts account){
//              accountRepository.save(account);
//              return account.getAccountId();
        
//     }
//     public void updateAccount(Integer accountId,Accounts accountDetails){
//        Accounts acc=accountRepository.findById(accountId).orElse(null);
//        if(acc==null){
//         throw new AccountNotFoundException("error");
//     }
//      accountRepository.save(acc);
     
       
//         //accounts.setCustomer_id(accountDetails.getCustomer_id());
//         //accounts.setBalance(accountDetails.getBalance());
        
    
//     }
//       public void deleteAccount(Integer id){
//        accountRepository.deleteById(id);
//      }
// }

