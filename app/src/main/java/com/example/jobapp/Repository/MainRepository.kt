package com.example.jobapp.Repository

import com.example.jobapp.Model.JobModel

class MainRepository {

    val location = listOf("LosAngel, USA", "Nework, USA")
    val category = listOf("All","Accountant", "Programmer", "Writer")

    val exampleText:String = "We are searching for a talented and motivated this job to join our growing team." +
            "In this role, you will be responsible for this job and will be responsible for this job."

    val items = listOf(
        JobModel(
            "UI Designer",
            "ChabokSoft",
            "logo1",
            "Full-Time",
            "Remote",
            "Internship",
            "Nework, USA",
            "\$38k - \$46k",
            "2",
            exampleText,
            exampleText
        ),
        JobModel(
            "Accountant",
            "KianSoft",
            "logo2",
            "Part-Time",
            "Remote",
            "In person",
            "LosAngel, USA",
            "\$26k - \$36k",
            "1",
            exampleText,
            exampleText
        ),
        JobModel(
            "The author of the news",
            "KomSoft",
            "logo3",
            "Part-Time",
            "Remote",
            "Senior level",
            "Nework, USA",
            "\$20k - \$23k",
            "3",
            exampleText,
            exampleText
        ),
        JobModel(
            "Kotlin Programmer",
            "AndroSoft",
            "logo4",
            "Full-Time",
            "Remote",
            "Internship",
            "LosAngel, USA",
            "\$38k - \$40k",
            "2",
            exampleText,
            exampleText
        ),
    )
}