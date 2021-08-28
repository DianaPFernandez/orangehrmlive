#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
@Regresion
Feature: Ingreso a Orange

  @Caso1
  Scenario Outline: Ingresó a Orange
    Given abrir el navegador
    When ingrese el usuario <userName> y la contraseña <password>

    Examples: 
      | userName | password |
      | Admin    | admin123 |

  @Caso2
  Scenario Outline: Crear un employee
    Given abrir el navegador
    When ingrese el usuario <userName> y la contraseña <password>
    And Acceder a la opcion add employee
    Then diligenciar los campos firtname <firstName> y lastname <lastName>

    Examples: 
      | userName | password | firstName | lastName  |
      | Admin    | admin123 | Diana     | Fernandez |
