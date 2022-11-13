$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("acceuil/Acceuil.feature");
formatter.feature({
  "line": 2,
  "name": "Acceuil-OrangeHRM",
  "description": "En tant qui etilisateur orange e souhaite acceder au module Recruitment",
  "id": "acceuil-orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@acceuil"
    }
  ]
});
formatter.before({
  "duration": 12372315600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "J me connecte lapplication orangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le login \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur  login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "redirection ver  le compte admin",
  "keyword": "Then "
});
formatter.match({
  "location": "AutentificationOutlineStepDefinition.jOuvreLapplicationOrangeHRM()"
});
formatter.result({
  "duration": 7123051900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    }
  ],
  "location": "AutentificationOutlineStepDefinition.jeSaisieLeLogin(String)"
});
formatter.result({
  "duration": 1104486900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AutentificationOutlineStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 341965400,
  "status": "passed"
});
formatter.match({
  "location": "AutentificationOutlineStepDefinition.jeCliqueSurLeBouttonLogin()"
});
formatter.result({
  "duration": 157544500,
  "status": "passed"
});
formatter.match({
  "location": "AutentificationOutlineStepDefinition.jeVerifieLeCompteAdmin()"
});
formatter.result({
  "duration": 1725302600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Acceder au module Recruitment",
  "description": "",
  "id": "acceuil-orangehrm;acceder-au-module-recruitment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@recruitment"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "je clique sur le module Recruitment",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "je verifie l affichage de la page Recruitment \"Candidates\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AcceuilStepDefinition.jeCliqueSurLeModuleRecruitment()"
});
formatter.result({
  "duration": 1774728700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Candidates",
      "offset": 47
    }
  ],
  "location": "AcceuilStepDefinition.jeVerifieLAffichageDeLaPageRecruitment(String)"
});
formatter.result({
  "duration": 512585100,
  "status": "passed"
});
formatter.after({
  "duration": 2560422800,
  "status": "passed"
});
formatter.before({
  "duration": 8673536000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "J me connecte lapplication orangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le login \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur  login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "redirection ver  le compte admin",
  "keyword": "Then "
});
formatter.match({
  "location": "AutentificationOutlineStepDefinition.jOuvreLapplicationOrangeHRM()"
});
formatter.result({
  "duration": 5926772800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    }
  ],
  "location": "AutentificationOutlineStepDefinition.jeSaisieLeLogin(String)"
});
formatter.result({
  "duration": 1030515800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AutentificationOutlineStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 333107400,
  "status": "passed"
});
formatter.match({
  "location": "AutentificationOutlineStepDefinition.jeCliqueSurLeBouttonLogin()"
});
formatter.result({
  "duration": 181583300,
  "status": "passed"
});
formatter.match({
  "location": "AutentificationOutlineStepDefinition.jeVerifieLeCompteAdmin()"
});
formatter.result({
  "duration": 1661769800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Acceder au module PIM",
  "description": "",
  "id": "acceuil-orangehrm;acceder-au-module-pim",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@PIM"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "je clique sur le module PIM",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "je verifie l affichage de la page PIM \"Configuration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AcceuilStepDefinition.jeCliqueSurLeModulePIM()"
});
formatter.result({
  "duration": 1180988200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Configuration",
      "offset": 39
    }
  ],
  "location": "AcceuilStepDefinition.jeVerifieLAffichageDeLaPagePIM(String)"
});
formatter.result({
  "duration": 496260400,
  "status": "passed"
});
formatter.after({
  "duration": 2234928100,
  "status": "passed"
});
});