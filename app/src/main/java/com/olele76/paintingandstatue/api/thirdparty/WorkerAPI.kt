package com.olele76.artgallery

import com.olele76.artgallery.model.Art
import com.olele76.artgallery.model.Painting
import com.olele76.paintingandstatue.model.Sculpture
import com.olele76.paintingandstatue.model.Statue

abstract class WorkerAPI() {

    abstract val url: String

    fun httpGetAllArt(): ArrayList<Art> {
        return DummyAPI.GenerateDummyPainting()
    }

    fun httpGetSingleRandomPainting(): Art {

        return DummyAPI.GenerateDummyPainting().random()
    }

    fun httpGetAllStatue(): ArrayList<Statue> {

        return DummyAPI.GenerateAllStatue()
    }

}

// Generator Class
class DummyAPI() {

    companion object {

        fun GenerateDummyPainting(): ArrayList<Art> {
            val paintings = GenerateAllPainting()
            val statues = GenerateAllStatue()

            return arrayListOf(
                paintings.get(0),
                paintings.get(1),
                statues.get(0),
                paintings.get(2),
                paintings.get(3),
                statues.get(1),
                paintings.get(4),
                paintings.get(5),
                statues.get(2),
                paintings.get(6),
                paintings.get(7),
                statues.get(3),
                statues.get(4)
            )
        }

        fun GenerateRandomDummyPainting(): Art {
            return GenerateAllPainting().random()
        }

        fun GenerateAllPainting(): ArrayList<Art> {
            val painting1 = Painting(
                "p0001", "The Scream",
                "The Scream",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Edvard_Munch%2C_1893%2C_The_Scream%2C_oil%2C_tempera_and_pastel_on_cardboard%2C_91_x_73_cm%2C_National_Gallery_of_Norway.jpg/440px-Edvard_Munch%2C_1893%2C_The_Scream%2C_oil%2C_tempera_and_pastel_on_cardboard%2C_91_x_73_cm%2C_National_Gallery_of_Norway.jpg",
                "painting",
                "Evard Munch"
            )
            val painting2 = Painting(
                "p0002", "Melancholy",
                "Melancholy",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Edvard_Munch_-_Melancholy_%281894%29.jpg/440px-Edvard_Munch_-_Melancholy_%281894%29.jpg",
                "painting",
                "Evard Munch"
            )
            val painting3 =
                Painting(
                    "p0003",
                    "Mona Lisa",
                    "Mona Lisa",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Mona_Lisa%2C_by_Leonardo_da_Vinci%2C_from_C2RMF_retouched.jpg/600px-Mona_Lisa%2C_by_Leonardo_da_Vinci%2C_from_C2RMF_retouched.jpg",
                    "painting",
                    "Leonardo da Vinci"
                )
            val painting4 =
                Painting(
                    "p0004",
                    "The Starry Night",
                    "The Starry Night",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Van_Gogh_-_Starry_Night_-_Google_Art_Project.jpg/600px-Van_Gogh_-_Starry_Night_-_Google_Art_Project.jpg",
                    "painting",
                    "Vincent van Gogh"
                )
            val painting5 =
                Painting(
                    "p0005",
                    "Girl with a Pearl Earring",
                    "Girl with a Pearl Earring",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/1665_Girl_with_a_Pearl_Earring.jpg/600px-1665_Girl_with_a_Pearl_Earring.jpg",
                    "painting",
                    "Johannes Vermeer"
                )
            val painting6 =
                Painting(
                    "p0006",
                    "Las Meninas",
                    "Las Meninas",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Las_Meninas%2C_by_Diego_Vel%C3%A1zquez%2C_from_Prado_in_Google_Earth.jpg/720px-Las_Meninas%2C_by_Diego_Vel%C3%A1zquez%2C_from_Prado_in_Google_Earth.jpg",
                    "painting",
                    "Diego Velázquez"
                )
            val painting7 =
                Painting(
                    "p0007",
                    "Portrait of a Man",
                    "Portrait of a Man",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Portrait_of_a_Man_in_a_Turban_%28Jan_van_Eyck%29_with_frame.jpg/440px-Portrait_of_a_Man_in_a_Turban_%28Jan_van_Eyck%29_with_frame.jpg",
                    "painting",
                    "Jan van Eyck"
                )
            val painting8 =
                Painting(
                    "p0008",
                    "Impression, Sunrise",
                    "Impression, Sunrise",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Monet_-_Impression%2C_Sunrise.jpg/800px-Monet_-_Impression%2C_Sunrise.jpg",
                    "painting",
                    "Claude Monet"
                )

            return arrayListOf(
                painting1,
                painting2,
                painting3,
                painting4,
                painting5,
                painting6,
                painting7,
                painting8
            )

        }

        fun GenerateAllStatue(): ArrayList<Statue> {
//            val statue1 = Statue(
//                "s001",
//                "David",
//                "David",
//                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/%27David%27_by_Michelangelo_Fir_JBU005_denoised.jpg/500px-%27David%27_by_Michelangelo_Fir_JBU005_denoised.jpg",
//                "statue",
//                "MichaelAngelo"
//            )
//            val statue2 = Statue(
//                "s002",
//                "Moses",
//                "Moses",
//                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/%27Moses%27_by_Michelangelo_JBU140.jpg/600px-%27Moses%27_by_Michelangelo_JBU140.jpg",
//                "statue",
//                "MichaelAngelo"
//            )
//            val statue3 = Statue(
//                "s003",
//                "David",
//                "David",
//                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Florence_-_David_by_Donatello.jpg/480px-Florence_-_David_by_Donatello.jpg",
//                "statue",
//                "Donatello"
//            )
//            val statue4 = Statue(
//                "s004",
//                "Saint George",
//                "Saint George",
//                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Donatello%2C_san_giorgio_01.JPG/500px-Donatello%2C_san_giorgio_01.JPG",
//                "statue",
//                "Donatello"
//            )
//            val statue5 = Statue(
//                "s005",
//                "Winged Victory of Samothrace",
//                "Winged Victory of Samothrace",
//                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Victoire_de_Samothrace_-_vue_de_trois-quart_gauche%2C_gros_plan_de_la_statue_%282%29.JPG/500px-Victoire_de_Samothrace_-_vue_de_trois-quart_gauche%2C_gros_plan_de_la_statue_%282%29.JPG",
//                "statue",
//                "unknown"
//            )

            val statue1 = Sculpture(
                "s001",
                "David",
                "David",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/%27David%27_by_Michelangelo_Fir_JBU005_denoised.jpg/500px-%27David%27_by_Michelangelo_Fir_JBU005_denoised.jpg",
                "statue",
                "MichaelAngelo",
                "marble"
            )
            val statue2 = Sculpture(
                "s002",
                "Moses",
                "Moses",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/%27Moses%27_by_Michelangelo_JBU140.jpg/600px-%27Moses%27_by_Michelangelo_JBU140.jpg",
                "statue",
                "MichaelAngelo",
                "marble"
            )
            val statue3 = Sculpture(
                "s003",
                "David",
                "David",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Florence_-_David_by_Donatello.jpg/480px-Florence_-_David_by_Donatello.jpg",
                "statue",
                "Donatello",
                "marble"
            )
            val statue4 = Sculpture(
                "s004",
                "Saint George",
                "Saint George",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Donatello%2C_san_giorgio_01.JPG/500px-Donatello%2C_san_giorgio_01.JPG",
                "statue",
                "Donatello",
                "clay"
            )
            val statue5 = Sculpture(
                "s005",
                "Winged Victory of Samothrace",
                "Winged Victory of Samothrace",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Victoire_de_Samothrace_-_vue_de_trois-quart_gauche%2C_gros_plan_de_la_statue_%282%29.JPG/500px-Victoire_de_Samothrace_-_vue_de_trois-quart_gauche%2C_gros_plan_de_la_statue_%282%29.JPG",
                "statue",
                "unknown",
                "clay"
            )

            return arrayListOf(
                statue1,
                statue2,
                statue3,
                statue4,
                statue5
            )
        }
    }

}