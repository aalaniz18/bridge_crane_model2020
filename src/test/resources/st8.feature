Feature: Test de limites de la grua

  Scenario: El sistema debe impedirle a la grua ir mas alla de sus limites.
    Given test drive ejecutado2
    When posicionar grua en un limite
    When mover grua mas alla del limite
    Then check misma posicion