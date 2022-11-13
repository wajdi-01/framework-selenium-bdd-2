@acceuil
Feature: Acceuil-OrangeHRM
  En tant qui etilisateur orange e souhaite acceder au module Recruitment

  Background: 
    Given J me connecte lapplication orangeHRM
    When Je saisie le login "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur  login
    Then redirection ver  le compte admin

  @recruitment
  Scenario: Acceder au module Recruitment
    When je clique sur le module Recruitment
    Then je verifie l affichage de la page Recruitment "Candidates"

  @PIM
  Scenario: Acceder au module PIM
    When je clique sur le module PIM
    Then je verifie l affichage de la page PIM "Configuration"
