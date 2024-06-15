package dev.swanhtetaungphyo;

import java.util.Arrays;
import java.util.List;


public class App 
{
    public static void main( String[] args ) {
        List<Course> allCourses = Arrays.asList(
                new Course("1", "Introduction to Artificial Intelligence with Python", "Learn the basics of AI with Python. Includes hands-on projects."),
                new Course("2", "Advanced Machine Learning", "Deep dive into machine learning techniques and algorithms. Practical applications."),
                new Course("3", "Data Structures and Algorithms", "Fundamentals of data structures and algorithms. Problem-solving strategies."),
                new Course("4", "Natural Language Processing", "Understand NLP techniques and applications. Text analysis and sentiment analysis."),
                new Course("5", "Computer Vision", "Introduction to computer vision and image processing. Image recognition and deep learning."),
                new Course("6", "Deep Reinforcement Learning", "Explore advanced RL algorithms and applications. Game playing and robotics."),
                new Course("7", "Big Data Analytics", "Techniques for analyzing large-scale datasets. Hadoop and Spark platforms."),
                new Course("8", "Blockchain Fundamentals", "Introduction to blockchain technology and applications. Smart contracts and cryptocurrencies."),
                new Course("9", "Web Development with React", "Building modern web applications using React. Single-page applications and REST APIs."),
                new Course("10", "Mobile App Development", "Developing mobile apps for iOS and Android platforms. Flutter and React Native frameworks."),
                new Course("11", "Cloud Computing Essentials", "Fundamentals of cloud computing services and platforms. AWS and Azure."),
                new Course("12", "Cybersecurity Basics", "Introduction to cybersecurity principles and practices. Network security and cryptography."),
                new Course("13", "Artificial Neural Networks", "Theory and applications of artificial neural networks. TensorFlow and Keras libraries."),
                new Course("14", "Quantum Computing", "Introduction to quantum computing concepts and algorithms. Qubits and quantum gates."),
                new Course("15", "Software Engineering Best Practices", "Effective strategies for software development. Agile methodologies and DevOps."),
                new Course("16", "Game Development with Unity", "Creating games using Unity game engine. 2D and 3D game design."),
                new Course("17", "Python Programming for Beginners", "Getting started with Python programming language. Basic syntax and data structures."),
                new Course("18", "UI/UX Design Fundamentals", "Principles of user interface and user experience design. Wireframing and prototyping."),
                new Course("19", "Digital Marketing Strategies", "Techniques for effective digital marketing campaigns. SEO and social media marketing."),
                new Course("20", "Entrepreneurship Essentials", "Key concepts and skills for successful entrepreneurship. Startup funding and growth strategies."),
                new Course("21", "Advanced Artificial Intelligence", "Advanced topics in AI including deep learning and neural network architectures."),
                new Course("22", "Reinforcement Learning Applications", "Practical applications of reinforcement learning in robotics and gaming."),
                new Course("23", "Data Science for Big Data", "Advanced techniques for processing and analyzing massive datasets."),
                new Course("24", "Advanced Data Structures", "Advanced data structures such as trees, graphs, and their applications."),
                new Course("25", "Advanced Algorithms", "Complex algorithms including dynamic programming and graph algorithms."),
                new Course("26", "Advanced Natural Language Processing", "Advanced topics in NLP such as machine translation and chatbot development."),
                new Course("27", "Deep Learning Architectures", "Advanced deep learning architectures including CNNs and RNNs."),
                new Course("28", "Computer Vision Applications", "Advanced applications of computer vision in medical imaging and autonomous vehicles."),
                new Course("29", "Blockchain Security", "Security issues and solutions in blockchain networks and smart contracts."),
                new Course("30", "Decentralized Applications", "Development of decentralized applications using blockchain technology."),
                new Course("31", "React Native Mobile Development", "Cross-platform mobile app development using React Native."),
                new Course("32", "Advanced Web Development", "Advanced web development techniques using JavaScript frameworks like Angular."),
                new Course("33", "Cloud Architecture", "Design and implementation of scalable cloud architectures using AWS and Google Cloud."),
                new Course("34", "Cloud Security", "Security measures and best practices for cloud computing environments."),
                new Course("35", "Advanced Cryptography", "Advanced cryptographic techniques and their applications in cybersecurity."),
                new Course("36", "Cybersecurity Threat Detection", "Methods for detecting and responding to cybersecurity threats."),
                new Course("37", "Machine Learning in Finance", "Applications of machine learning models in financial markets."),
                new Course("38", "AI in Healthcare", "Applications of AI and machine learning in healthcare diagnostics and treatment."),
                new Course("39", "AR/VR Development", "Development of augmented reality (AR) and virtual reality (VR) applications."),
                new Course("40", "Advanced UI/UX Design", "Advanced principles and practices in UI/UX design for optimal user experience."),
                new Course("41", "Social Media Marketing Analytics", "Analytics and insights for effective social media marketing strategies."),
                new Course("42", "Content Marketing Strategies", "Strategies for creating and distributing valuable content to attract and retain customers."),
                new Course("43", "Startup Growth Strategies", "Growth hacking techniques and strategies for startups."),
                new Course("44", "Venture Capital Funding", "Processes and strategies for securing venture capital funding."),
                new Course("45", "E-commerce Business Models", "Different business models and strategies for e-commerce ventures."),
                new Course("46", "Digital Transformation", "Strategies and technologies for transforming businesses digitally."),
                new Course("47", "Leadership and Innovation", "Skills and strategies for effective leadership and fostering innovation."),
                new Course("48", "Agile Project Management", "Agile methodologies for managing software development projects."),
                new Course("49", "Mobile Game Development", "Development of mobile games for iOS and Android platforms."),
                new Course("50", "Advanced Unity Game Development", "Advanced techniques for creating complex games using Unity.")
        );


        User user = new User(
                "user1",
                Arrays.asList("Introduction to Artificial Intelligence with Python", "Data Structures and Algorithms"),
                Arrays.asList("deep learning", "image processing", "marketing", "python", "game development", "blockchain", "quantum computing", "cybersecurity",
                        "data science", "advanced algorithms", "natural language processing", "cloud computing", "react native", "web development",
                        "cryptography", "machine learning in finance", "AI in healthcare", "AR/VR development", "social media marketing")
        );

        List<Course> recommendation = CourseRecommender.recommendCourses(user, allCourses, user.registeredCourses);
        for(Course course : recommendation){
            System.out.println(course.getTitle());
        }
    }
}
