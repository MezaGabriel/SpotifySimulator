# SpotifySimulator

## Enunciado

La idea del ejercicio es simular un poco la funcionalidad de Spotify, no vamos a reproducir audio pero vamos a desarrollar dos funcionalidades
  - Crear una lista de reproduccion
  - Calcular la duración total de una lista de reproducción
  - La lista de reproducción se puede componer de cualquier reproducible dentro de Spotify, esto es:
    - Una Pista
    - Un Album
    - Otra lista de reproduccion

Luego se debería calcular la duración total obtenida de la suma de la duración de cada lista, album y pista (Sería una canción)  dentro de la lista de reproducción

Modelar y realizar pruebas unitarias

A tener en cuenta:
  - Las pistas, los albums y las listas de reproducción al no poseer la misma naturaleza no pueden heredar de la misma clase, sin embargo, las tres pueden ser reproducibles
  - La lista de reproducción debería tener un solo metodo para agregar ya sea una pista, un album o una lista de reproduccion
  - Un album tiene varias pistas, esto es, no se puede crear un album sin canciones
  - A la hora de calcular la duración, el cálculo debería de ser polimórfico
  - Se de usar la clase Duration para saber la duracion de cada uno de los reproducibles
