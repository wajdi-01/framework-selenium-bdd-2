@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m authentifier

  @ct-passant
  Scenario: Authentification - OrangeHRM
    Given J me connecte lapplication orangeHRM
    When Je saisie le login "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur  login
    Then redirection ver  le compte admin
    
    @cnx
    Scenario Outline: Authentification - OrangeHRM
    Given J me connecte lapplication orangeHRM
    When Je saisie le login "<login>"
    And Je saisie le mot de passe "<password>"
    And Je clique sur  login
    Then redirection ver  le compte admin

    Examples: 
      | login | password |
      | Admin | admin123 |
     