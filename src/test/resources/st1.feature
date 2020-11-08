Feature: test movimiento de grua en proceso de carga

  Scenario: El sistema deberá impedir el movimiento de la grúa cuando está en proceso de carga.
    Given test drive ejecutado
    When mover grua 1
    When ingresa contrasenia
    When mover la grua 2
    Then misma posicion