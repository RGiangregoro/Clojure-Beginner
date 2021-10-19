(ns hello.StructMaps)

(defn Pets
  []
  (defstruct pets :PetType :PetName)
  (def a (struct pets "dog" "Fido"))
  (println a)

  (def myOtherPet (struct-map pets :PetName "Fifi" :PetType "cat"))
  (println myOtherPet)
  (println (:PetName myOtherPet))
  (println (:PetType myOtherPet))

  (def myNewPet (assoc a :PetName "Max"))
  (println myNewPet)

  (def myNewOtherPet (assoc myOtherPet :PetAge 10))
  (println myNewOtherPet)
  )
(Pets)